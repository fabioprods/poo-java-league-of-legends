public class ExcecaoPersonalizada {
    public static void main(String[] args) {
        try {
            sacar(100, 150);
            System.out.println("saque feito");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("fim");
    }

    static void sacar(int saldo, int valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        System.out.println("sacando " + valor);
    }
}

class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para o saque");
    }
}
