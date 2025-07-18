package desafios.quintoDesafio;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca conta = new ContaPoupanca(100);

        conta.depositar(200);

        System.out.println(conta.consultarSaldo());
    }
}
