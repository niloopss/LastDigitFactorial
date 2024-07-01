import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para calcular o último dígito do fatorial: ");
        int N = scanner.nextInt();

        Fatorial fatorial = new Fatorial(N);
        int ultimoDigito = fatorial.calcularUltimoDigito();

        System.out.println("O último dígito do fatorial de " + N + " é: " + ultimoDigito);

        // Gravando o resultado no README.md
        try (FileWriter writer = new FileWriter("README.md", true)) { // true para append
            writer.write("\n## Resultado da Execução\n\n");
            writer.write("O último dígito do fatorial de " + N + " é: " + ultimoDigito + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo README.md: " + e.getMessage());
        }

        scanner.close();
    }
}
