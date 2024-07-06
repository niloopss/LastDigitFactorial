# Atividade 1 - tarefa II - Último Dígito Fatorial

## Descrição

LatsDigitFactorial é um código que calcula e exibe o último dígito do fatorial de até 10 números inteiros não negativos fornecidos pelo usuário.

## Uso

1. **Execute o código:** Compile e execute o arquivo Main.java.
2. **Insira os números:** Quando solicitado, digite até 10 números inteiros não negativos, separados por espaços.
3. **Veja os resultados:** O programa imprimirá os últimos dígitos dos fatoriais dos números inseridos.


## Fluxograma

![Fluxograma - LastDigitFactorial - Mermaid.png](Fluxograma%20-%20LastDigitFactorial%20-%20Mermaid.png)


**Análise do Fluxograma:**

1. **Início:** O programa começa.
2. **Obter números do usuário:** O usuário insere os números.
3. **10 números ou menos?:** Verifica a quantidade.
- **Sim:** Prossegue para verificar se são números válidos.
- **Não:** Exibe erro de limite excedido e termina.
4. **Todos são números?:** verifica se todas as entradas são números.
- **Sim:** Prossegue para verificar se são positivos.
- **Não:** Exibe erro de formato inválido e termina.
5. **Todos são positivos?:** verifica se todos os números são positivos.
- **Sim:** Calcula o fatorial e o último dígito de cada número.
- **Não:** Exibe erro de número negativo e termina.
6. **Calcular fatorial e último dígito:** Realiza os cálculos para cada número válido.
7. **Exibir últimos dígitos:** Mostra os resultados na tela.
8. **Fim:** O programa termina.

## Resultados da Execução

A tabela abaixo mostra o último dígito do fatorial de cada número testado:

### Exemplos de Sucesso


| Input                       | Output                                                                 |                                  Explicação                                          |                                
|-----------------------------|------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| 3 1 2 3                     | 6 1 2 6                                                                | O último dígito de 3! (6), 1! (1), 2! (2) e 3! (6) são 6, 1, 2 e 6, respectivamente. |
| 2 5 2                       | 2 0 2                                                                  | O último dígito de 2! (2), 5! (120) e 2! (2) são 2, 0 e 2, respectivamente.          |

![Resultado - LastDigitFactorial - IntelliJ.png](Resultado%20-%20LastDigitFactorial%20-%20IntelliJ.png)  
![Resultado 2 - LastDigitFactorial - IntelliJ.png](Resultado%202%20-%20LastDigitFactorial%20-%20IntelliJ.png)
Resultados com inputs válidos

### Exemplos de Erro


| Input                       | Output                                                                 |
|-----------------------------|------------------------------------------------------------------------|
| 1 1 2 2 3 3 4 4 5 5 6 6 7 7 | Erro: Você digitou mais de 10 números. Por favor, digite no máximo 10. | 
| -9                          | Números devem ser não negativos.                                       |      
| 1 22 33 a 44 5              | 1 0 0 0 0    Entrada Inválida: 'a' não é um número válido              |

![Resultado Erro +10 Numeros - LastDigitFactorial - IntelliJ.png](Resultado%20Erro%20%2B10%20Numeros%20-%20LastDigitFactorial%20-%20IntelliJ.png)  
Resultado com mais de 10 números  

![Resultado Erro Numeros Negativos - LastDigitFactorial - IntelliJ.png](Resultado%20Erro%20Numeros%20Negativos%20-%20LastDigitFactorial%20-%20IntelliJ.png)  
Resultado com números negativos  

![Resultado Erro Entrada Inválida - LastDigitFactorial - IntelliJ.png](Resultado%20Erro%20Entrada%20Inv%E1lida%20-%20LastDigitFactorial%20-%20IntelliJ.png)  
Resultado com input inválido  