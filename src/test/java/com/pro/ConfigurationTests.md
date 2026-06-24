# Configuration Tests

Essa classe de teste verifica se uma propriedade customizada definida no projeto Spring Boot está sendo corretamente carregada pelo contexto da aplicação.

	@SpringBootTest

Sobe o contexto completo da aplicação Spring Boot durante o teste.

Carrega beans, configurações e properties
Simula o ambiente real da aplicação

	@ExtendWith(SpringExtension.class)

Integra o JUnit 5 com o Spring Test Framework.

Permite injeção de dependências no teste
Faz o Spring gerenciar o ciclo de vida do contexto

	@Value("${custom.property}")

Injeta o valor da propriedade definida no application.properties ou application.yml.