package com.pro.configuration;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class CustomRestTemplate extends RestTemplate {
    public CustomRestTemplate(ClientHttpRequestFactory factory) {
        super(factory);
    }

    @Override
    public String toString() {
        return "CustomRestTemplate - Timeout configurado";
    }
}