# Test

	ProApplicationTests.java

Esta classe é um teste básico de integração do Spring Boot, utilizado para validar se o contexto da aplicação é carregado corretamente durante a inicialização.

* O Spring consegue inicializar o contexto da aplicação
* Todas as configurações básicas estão corretas
* Não há erros críticos em beans, dependências ou configurações

## Anotações utilizadas

	@SpringBootTest

Indica que o teste deve carregar o contexto completo da aplicação Spring Boot.

Sobe toda a aplicação em memória
Simula o ambiente real de execução
Usado para testes de integração

	@ExtendWith(SpringExtension.class)

Integra o JUnit 5 com o Spring TestContext Framework.

Permite que o Spring gerencie o ciclo de vida do teste
Habilita injeção de dependências e suporte ao contexto Spring

## Métodos

@Test
void contextLoads() {
}

Este método não contém asserções explícitas porque seu objetivo é simples:

Se o contexto carregar sem lançar exceções → o teste passa
Se houver erro na inicialização → o teste falha
