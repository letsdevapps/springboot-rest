package com.pro.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * CORS Configuration without Spring Security
 * */

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                	"https://letsdevapps.github.io/",
                	"http://localhost:8000"
                )
                .allowedMethods(
                    "GET",
                    "POST",
                    "PUT",
                    "DELETE",
                    "OPTIONS"
                )
                .allowedHeaders("*");
    }
}
