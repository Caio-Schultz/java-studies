import java.util.Scanner;

public class ProgramaDeBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Programa de Banco

        // Apresentação

        System.out.println("******************");
        System.out.println("Programa de Banco");
        System.out.println("******************");
        System.out.println("1.Mostrar saldo");
        System.out.println("2.Depósito");
        System.out.println("3.Saque");
        System.out.println("4.Sair");
        System.out.println("******************");


        // declaração das variáveis

        int escolhaUsuario;
        double saldoDaConta = 0;

        // loop até o usuário SAIR digitando o número 4

    do {

        System.out.print("Digite sua escolha (1-4): ");
        escolhaUsuario = scanner.nextInt();


        if (escolhaUsuario == 1) {
            System.out.println("Seu saldo é: " + saldoDaConta);
        } else if (escolhaUsuario == 2) {
            System.out.print("Quanto deseja depositar: ");
            double valorDepositado = scanner.nextDouble();
            System.out.println("Valor depositado com sucesso!");
            saldoDaConta = saldoDaConta + valorDepositado;
        } else if (escolhaUsuario == 3) {
            System.out.print("Quanto deseja sacar: ");
            double valorDeSaque = scanner.nextDouble();
            System.out.println("Valor sacado com sucesso!");
            saldoDaConta = saldoDaConta - valorDeSaque;
        } else if (escolhaUsuario == 4) {
            System.out.println("Obrigado! Volte sempre!");
        }

    } while(escolhaUsuario != 4);


        scanner.close();
    }
}
