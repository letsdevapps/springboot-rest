# Documentação de Testes

Este diretório contém a documentação dos testes implementados no projeto. Os testes são organizados por categoria: unitários, integração, performance, resiliência, etc.

## Categorias de Testes

- **Testes Unitários**: Testes das unidades menores do código (funções, classes).
  - [Camada de Serviço](unit/service-layer.md)
  - [Camada de Controlador](unit/controller-layer.md)
  
- **Testes de Integração**: Testes que validam a interação entre componentes.
  - [Conexão com Banco de Dados](integration/db-connection.md)
  - [Comunicação com API Externa](integration/api-communication.md)
  
- **Testes de Performance**: Testes de tempo de execução e capacidade de carga.
  - [Tempo de Inicialização da Aplicação](performance/app-startup.md)

- **Testes de Resiliência**: Testes que garantem que a aplicação lida bem com falhas.
  - [Falha no Serviço Externo](resilience/external-service-failover.md)

- **Testes Funcionais**: Testes end-to-end que verificam o comportamento do sistema.
  - [Login de Usuário](functional/user-login.md)
  
- **Cobertura de Testes**: Relatório de cobertura de testes para garantir que a aplicação está bem testada.
  - [Relatório de Cobertura de Testes](coverage/test-coverage-report.md)
  
---

## Como Contribuir
Se você quiser adicionar novos testes ou melhorar os existentes, siga as diretrizes abaixo para escrever a documentação dos testes:
1. Crie um arquivo markdown correspondente à categoria.
2. Descreva o **objetivo**, **como funciona**, **ferramentas utilizadas** e **resultado esperado**.
3. Envie um pull request com a documentação.

Para dúvidas sobre como escrever testes, consulte [nosso guia interno de testes](link_outra_pasta).

