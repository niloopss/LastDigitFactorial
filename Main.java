import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe principal para calcular e exibir os últimos dígitos dos fatoriais de até 10 números inteiros não negativos.
 * Os resultados são exibidos no console e também adicionados ao final do arquivo README.md.
 * @author Nivea Lins
 */
public class Main {
    /**
     * Método principal que executa o programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite até 10 números separados por espaço: ");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(" ");

        if (numerosStr.length > 10) {
            System.err.println("Erro: Você digitou mais de 10 números. Por favor, digite no máximo 10.");
            return;
        }

        try (FileWriter writer = new FileWriter("README.md", true)) {
            writer.write("\n## Resultado da Execução\n\n");

            for (String numStr : numerosStr) {
                try {
                    int numero = Integer.parseInt(numStr);
                    if (numero < 0) {
                        throw new IllegalArgumentException("Números devem ser não negativos.");
                    }
                    Fatorial fatorial = new Fatorial(numero);
                    int ultimoDigito = fatorial.calcularUltimoDigito();
                    System.out.print(ultimoDigito + " ");
                    writer.write(ultimoDigito + " ");
                } catch (NumberFormatException e) {
                    System.err.println("Entrada inválida: '" + numStr + "' não é um número válido.");
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                }
            }

            System.out.println();
            writer.write("\n");

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo README.md: " + e.getMessage());
        }

        scanner.close();
    }
}
