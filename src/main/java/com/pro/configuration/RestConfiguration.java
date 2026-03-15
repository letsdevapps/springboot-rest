package com.pro.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class RestConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(RestConfiguration.class);

	@Bean(name = "restTemplate")
	public RestTemplate restTemplate() {
		logger.info("Iniciando a criação do RestTemplate simples...");
		RestTemplate restTemplate = new RestTemplate();

		logger.info("RestTemplate simples criado com sucesso!");
		return restTemplate;
	}

	@Bean
	public WebClient.Builder webClientBuilder() {
		logger.info("Iniciando a criação do WebClient ...");
		WebClient.Builder webClient = WebClient.builder();

		logger.info("WebClient criado com sucesso!");
		return webClient;
	}

	// metodo custom
	@Bean(name = "customRestTemplate")
	public RestTemplate customRestTemplate() {
		int connectionTimeout = 5000; // 5 segundos
		int readTimeout = 5000; // 5 segundos

		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(connectionTimeout);
		factory.setReadTimeout(readTimeout);

		return new RestTemplate(factory);
	}

	// classe custom
	@Bean(name = "customClassRestTemplate")
	public CustomRestTemplate customClassRestTemplate() {
		logger.info("Criando o RestTemplate Classe customizado...");
		int connectionTimeout = 5000;
		int readTimeout = 5000;
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(connectionTimeout);
		factory.setReadTimeout(readTimeout);
		return new CustomRestTemplate(factory);
	}
}