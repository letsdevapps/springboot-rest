package com.pro;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
//@ActiveProfiles("test")  // Carrega o arquivo application-test.properties
//@TestPropertySource(locations = "classpath:application-test.properties")  // Adiciona explicitamente a localização do arquivo de configuração
//@TestPropertySource("classpath:application-test.properties")
public class ConfigurationTests {

    @Value("${custom.property}")
    private String customProperty;

    @Test
    public void testCustomProperty() {
        //assertThat(customProperty).isEqualTo("expectedValue"); //assertj
        assertEquals("expectedValue", customProperty); //junit5
    }
}