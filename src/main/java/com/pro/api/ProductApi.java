package com.pro.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.model.Product;
import com.pro.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductApi {

	@Autowired
	private ProductService productService;

	@GetMapping({ "", "/" })
	public String index() {
		return "Api Produto está acessível!";
	}

	@GetMapping("/prod")
	public ResponseEntity<Product> getProduct() {
		return ResponseEntity.ok(productService.getProduct());
	}

	@GetMapping("/prod-list")
	public ResponseEntity<List<Product>> getProductList() {
		return ResponseEntity.ok(productService.getProductList());
	}
}

//GET    /users        -> lista
//GET    /users/{id}   -> busca
//POST   /users        -> cria
//PUT    /users/{id}   -> atualiza
//DELETE /users/{id}   -> remove
