package com.pro.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private Integer id;
	private String name;
	private Double price;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private Boolean available;
}