package com.pro.model;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Product object model")
public class Product {
	
	private Integer id;
	@Schema(description = "Product Name", example = "Keyboard and Mouse")
	private String name;
	@Schema(description = "Product Price", example = "123.45")
	private Double price;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private Boolean available;
}