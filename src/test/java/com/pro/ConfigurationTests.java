package com.pro;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
//@ActiveProfiles("test") // Carrega o arquivo application-test.properties
//@TestPropertySource(locations = "classpath:application-test.properties") // Adiciona explicitamente a localização do
//@TestPropertySource("classpath:application-test.properties")
public class ConfigurationTests {

	@Value("${custom.property}")
	private String customProperty;

	// junit5
	@Test
	public void testCustomPropertyJunit() {
		assertEquals("expectedValue", customProperty);
	}

	// assertj
	@Test
	public void testCustomPropertyAssertj() {
		assertThat(customProperty)
		.isNotNull()
		.isNotBlank()
		.isEqualTo("expectedValue");
	}
}