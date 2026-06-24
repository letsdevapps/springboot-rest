package com.pro;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class StartupPerformanceTests {

	@Test
	public void testApplicationStartup() {
		long start = System.currentTimeMillis();

		ConfigurableApplicationContext context = SpringApplication.run(ProApplication.class);

		long end = System.currentTimeMillis();

		context.close();

		long duration = end - start;

		assertThat(duration).isLessThan(5000);
	}
}