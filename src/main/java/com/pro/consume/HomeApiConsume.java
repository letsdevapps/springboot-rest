package com.pro.consume;

import java.net.URI;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/consume")
public class HomeApiConsume {

	@Autowired
	private RestTemplate restTemplate;

	// Novos projetos são incentivados a usar WebClient
	@Autowired
	private WebClient.Builder webClientBuilder;

	@GetMapping
	public ResponseEntity<String> indexRest() {
		String apiUrl = "http://localhost:8080/api/home";
		ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);
		return response;
	}

	@GetMapping("/webclient")
	public Mono<ResponseEntity<String>> indexWebclient() {
		WebClient webClient = webClientBuilder.baseUrl("http://localhost:8080/api/home").build();

		return webClient.get().retrieve().toEntity(String.class);
	}

	@GetMapping("/lorem-ipsum")
	public ResponseEntity<String> getLoremIpsum() {
		String apiUrl = "http://localhost:8080/api/home/lorem-ipsum";
		ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);
		return response;
	}

	@GetMapping("/get-int")
	public ResponseEntity<Integer> getInt() {
		String apiUrl = "http://localhost:8080/api/home/get-int";
		ResponseEntity<Integer> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, Integer.class);
		return response;
	}

	@GetMapping("/get-int-param/exchange")
	public ResponseEntity<String> getIntParamWithExchange() {
		String url = "http://localhost:8080/api/home/get-int-param?val=10";

		HttpEntity<Void> requestEntity = new HttpEntity<>(null);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);

		return response;
	}

	@GetMapping("/get-int-param/uri")
	public ResponseEntity<String> getIntParamWithUri() {
		URI uri = UriComponentsBuilder
				.fromHttpUrl("http://localhost:8080/api/home/get-int-param")
				.queryParam("val", 10)
				.build().toUri();

		ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, null, String.class);

		return response;
	}

	@GetMapping("/get-int-param/entity")
	public ResponseEntity<String> getIntParamWithEntity() {
		String url = "http://localhost:8080/api/home/get-int-param?val={val}";

	    ResponseEntity<String> response =
	            restTemplate.getForEntity(url, String.class, 10);

		return response;
	}

	@GetMapping("/get-date")
	public ResponseEntity<LocalDate> getDate() {
		String apiUrl = "http://localhost:8080/api/home/get-date";
		ResponseEntity<LocalDate> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, LocalDate.class);
		return response;
	}
}