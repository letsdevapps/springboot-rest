package com.pro.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pro.configuration.CustomRestTemplate;

@RestController
public class RestTemplateConfigurationTest {

	private static final Logger logger = LoggerFactory.getLogger(RestTemplateConfigurationTest.class);

	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;

	@Autowired
	@Qualifier("customRestTemplate")
	private RestTemplate customRestTemplate;
	
	@Autowired
	@Qualifier("customClassRestTemplate")
	private CustomRestTemplate customClassRestTemplate;

	@GetMapping("/test-simple")
	public String testSimpleRestTemplate() {
		logger.info("Utilizando o RestTemplate: {}", restTemplate.getClass().getSimpleName());
		logger.info("Utilizando o RestTemplate: {}", restTemplate.toString());

		String url = "https://httpbin.org/delay/3"; // Endpoint de resposta lenta
		try {
			String response = restTemplate.getForObject(url, String.class);
			return "Resposta com simples: " + response;
		} catch (Exception e) {
			return "Erro com simples: " + e.getMessage();
		}
	}

	@GetMapping("/test-custom")
	public String testCustomRestTemplate() {
		logger.info("Utilizando o RestTemplate: {}", customRestTemplate.getClass().getSimpleName());
		logger.info("Utilizando o RestTemplate: {}", customRestTemplate.toString());

		String url = "https://httpbin.org/delay/3"; // Endpoint de resposta lenta
		try {
			String response = customRestTemplate.getForObject(url, String.class);
			return "Resposta com custom (timeout): " + response;
		} catch (Exception e) {
			return "Erro com custom (timeout): " + e.getMessage();
		}
	}

	@GetMapping("/test-class-custom")
	public String consumeApi() {
		logger.info("RestTemplate injetado: {}", customClassRestTemplate.toString());

		String url = "https://httpbin.org/get";
		String response = customClassRestTemplate.getForObject(url, String.class);

		return "Resposta da API: " + response;
	}
}