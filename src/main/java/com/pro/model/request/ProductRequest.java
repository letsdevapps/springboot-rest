package com.pro.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Dados do produto recebido via request")
public class ProductRequest {

	@NotBlank
	@Schema(description = "Product ID", example = "1")
	private Integer id;
	@NotBlank
	@Schema(description = "Product Name", example = "Keyboard and Mouse")
	private String name;
	@Positive
	@Schema(description = "Product Price", example = "123.45")
	private Double price;
}