package com.pro;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StartupPerformanceTests {

    @Test
    public void testApplicationStartup() {
        long start = System.currentTimeMillis();
        
        SpringApplication.run(ProApplication.class);

        long end = System.currentTimeMillis();
        long duration = end - start;
        
        assertThat(duration).isLessThan(5000); // Verifica se a inicialização é feita em menos de 5 segundos
    }
}