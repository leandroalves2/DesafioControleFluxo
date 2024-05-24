# Desafio Controle de Fluxo

Este projeto foi desenvolvido como parte dos exercícios do módulo de Controle de Fluxo. O objetivo é praticar e consolidar os conceitos aprendidos, implementando um sistema que recebe dois parâmetros via terminal e realiza uma contagem incremental entre esses valores, imprimindo os resultados no console. Em caso de erro, o sistema deve lançar uma exceção customizada.

## Funcionalidades

- **Entrada de Parâmetros**: O sistema recebe dois números inteiros como parâmetros via terminal.
- **Interações e Impressão**: Com base nos dois números fornecidos, o sistema realiza uma interação (`for`) que imprime no console os números incrementados.
  - Exemplo: Se os números fornecidos forem 12 e 30, o sistema imprimirá 18 ocorrências, como "Imprimindo o número 1", "Imprimindo o número 2", e assim por diante até "Imprimindo o número 18".
- **Validação de Parâmetros**: Se o primeiro parâmetro for maior que o segundo, o sistema lança uma exceção customizada chamada `ParametrosInvalidosException` com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".
