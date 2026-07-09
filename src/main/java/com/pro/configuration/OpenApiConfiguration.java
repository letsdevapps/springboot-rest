package com.pro.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfiguration {

//	http://localhost:8080/swagger-ui.html
//	http://localhost:8080/swagger-ui/index.html

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Springboot Rest")
                        .version("1.0")
                        .description("API Documentation of Springboot Rest project"));
    }
}