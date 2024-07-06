# Atividade 1 - tarefa II - Último Dígito Fatorial

## Descrição

LatsDigitFactorial é um código que calcula e exibe o último dígito do fatorial de até 10 números inteiros não negativos fornecidos pelo usuário. O código-fonte deste projeto foi totalmente documentado utilizando JavaDocs, facilitando a compreensão e manutenção do sistema.



## Uso

1. **Execute o código:** Compile e execute o arquivo Main.java.
2. **Insira os números:** Quando solicitado, digite até 10 números inteiros não negativos, separados por espaços.
3. **Veja os resultados:** O programa imprimirá os últimos dígitos dos fatoriais dos números inseridos.


## Fluxograma

![Fluxograma - LastDigitFactorial - Mermaid.png](Fluxograma%20-%20LastDigitFactorial%20-%20Mermaid.png)


**Análise do Fluxograma:**

1. **Classe Main:**
**Start:** Início do programa.
**Criar Scanner:** Cria um objeto Scanner para ler a entrada do usuário.
**Ler números (até 10):** Lê os números fornecidos pelo usuário, com um limite de 10.
**<= 10 números?:** Verifica se a quantidade de números é menor ou igual a 10.
- **Sim:** Cria objetos Fatorial para cada número e calcula o último dígito do fatorial.
- **Não:** Exibe uma mensagem de erro indicando que o usuário excedeu o limite de números e encerra o programa.
**Criar Fatorial para cada número:** Cria um objeto Fatorial para cada número válido.
**Calcular último dígito (Fatorial.calcularUltimoDigito):** Chama o método calcularUltimoDigito da classe Fatorial para calcular o último dígito do fatorial de cada número.
**Imprimir resultado:** Imprime os últimos dígitos calculados.
**Fechar Scanner:** Fecha o objeto Scanner.
**End:** Fim do programa.

2. **Classe Fatorial:**
**Construtor Fatorial(numero):** Inicializa o objeto Fatorial com o número fornecido.
**calcularUltimoDigito():** Calcula o último dígito do fatorial do número.
- **numero < 0:** Se o número for negativo, lança uma exceção IllegalArgumentException.
- **numero <= 1:** Se o número for 0 ou 1, retorna 1 (o último dígito do fatorial de 0 e 1 é 1).
**LoopCalculo:** Caso contrário, entra em um loop para calcular o fatorial e extrair o último dígito.
- **ultimoDigito = 1:** Inicializa a variável ultimoDigito com 1.
- **for i = 2; i <= numero; i++:** Itera de 2 até o número fornecido.
- **(ultimoDigito * i) % 10:** Calcula o último dígito do produto atual e armazena em ultimoDigito.
- **return ultimoDigito:** Retorna o último dígito calculado.

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