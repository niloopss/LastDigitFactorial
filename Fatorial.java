class Fatorial {
    private final int numero;

    public Fatorial(int numero) {
        this.numero = numero;
    }

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
