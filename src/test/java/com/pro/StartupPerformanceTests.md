# Teste de Performance de Inicialização (StartupPerformanceTests)

Esta classe tem como objetivo medir o tempo de inicialização da aplicação Spring Boot, garantindo que o sistema seja carregado dentro de um limite aceitável de desempenho.

## Objetivo

* Medir o tempo de inicialização da aplicação
* Garantir que a aplicação não está degradando em performance de startup
* Detectar rapidamente problemas de configuração ou beans pesados

## Funcionamento

1. Inicia a contagem de tempo
2. Sobe a aplicação Spring Boot
3. Finaliza a contagem após inicialização
4. Fecha o contexto manualmente
5. Valida se o tempo foi menor que 5 segundos

## Observação importante

Esse tipo de teste pode variar dependendo de:

* máquina de execução
* carga do sistema
* cache do Spring
* ambiente (IDE vs CI)

Por isso, ele é mais útil como alerta de regressão de performance, não como métrica absoluta.
