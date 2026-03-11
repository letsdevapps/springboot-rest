package com.pro.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.pro.model.Product;

@RestController
@RequestMapping("/api/product/consume")
public class ProductApiConsume {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@GetMapping("")
	public Product createProduct() {

		Product product = new Product();
		product.setId(100);
		product.setName("Keyboard");
		product.setPrice(200.00);

		return webClientBuilder.build().post().uri("http://localhost:8080/api/product/prod").bodyValue(product)
				.retrieve().bodyToMono(Product.class).block();
	}
}