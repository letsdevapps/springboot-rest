package com.pro;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ResilienceTests {

	/*@Autowired
	private MessageRepository messageRepository;

	@Test
	public void whenDatabaseIsDown_thenApplicationShouldHandleGracefully() {
		// Simula falha no banco de dados
		// Como o banco H2 está vazio e não tem dados, a operação falhará
		Throwable exception = assertThrows(DataAccessException.class, () -> {
			messageRepository.findById(1L); // Vai falhar pois o banco está vazio
		});

		// Verifica se o erro esperado é o DataAccessException (erro de acesso ao banco)
		assertThat(exception).isInstanceOf(DataAccessException.class);
	}*/
}