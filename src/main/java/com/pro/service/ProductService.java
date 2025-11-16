package com.pro.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pro.model.Product;

@Service
public class ProductService {

	private Product p;
	private List<Product> pList;

	public Product getProduct() {
		p = new Product();
		p.setId(1);
		p.setName("Teclado e Mouse Gamer");
		p.setPrice(987.65);
		p.setCreatedAt(LocalDate.now());
		p.setUpdatedAt(LocalDate.now());
		p.setAvailable(true);
		return p;
	}

	public List<Product> getProductList() {
		pList = new ArrayList<Product>();

		Product p1 = new Product(1, "Teclado e Mouse Gamer", 98.76, LocalDate.now(), LocalDate.now(), true);
		pList.add(p1);

		Product p2 = new Product(2, "Toyota Corolla 98-99", 12345.67, LocalDate.now(), LocalDate.now(), true);
		pList.add(p2);

		Product p3 = new Product(3, "Geladeira Frost-Free Porta Dupla", 900.11, LocalDate.now(), LocalDate.now(), true);
		pList.add(p3);

		Product p4 = new Product(4, "Apartamento 4 Comodos + Banheiro, Lavanderia e Sacada", 150000.00, LocalDate.now(),
				LocalDate.now(), true);
		pList.add(p4);

		return pList;
	}
}
