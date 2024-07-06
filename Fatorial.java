/**
 * Classe responsável por calcular o último dígito do fatorial de um número inteiro não negativo.
 * @author Nivea Lins
 */
class Fatorial {
    /**
     * Número inteiro não negativo para o qual o fatorial será calculado.
     */
    private final int numero;

    /**
     * Construtor da classe Fatorial.
     *
     * @param numero O número inteiro não negativo para o qual o fatorial será calculado.
     * @throws IllegalArgumentException Se o número fornecido for negativo.
     */
    public Fatorial(int numero) {
        this.numero = numero;
    }

    /**
     * Calcula o último dígito do fatorial do número.
     *
     * @return O último dígito do fatorial do número.
     */
    public int calcularUltimoDigito() {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        } else if (numero <= 1) {
            return 1;
        } else {
            int ultimoDigito = 1;
            for (int i = 2; i <= numero; i++) {
                ultimoDigito = (ultimoDigito * i) % 10;
            }
            return ultimoDigito;
        }
    }
}
