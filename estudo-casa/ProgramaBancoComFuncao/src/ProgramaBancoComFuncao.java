import java.util.Scanner;

public class ProgramaBancoComFuncao {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("Programa de Banco");
        System.out.println("******************");
        System.out.println("1.Mostrar saldo");
        System.out.println("2.Depósito");
        System.out.println("3.Saque");
        System.out.println("4.Sair");
        System.out.println("******************");

        int escolhaUsuario;
        boolean estaRodando = true;
        double saldo = 0;
        double valorDepositado = 0;
        double valorSacado = 0;

        while(estaRodando) {
            System.out.print("Digite sua escolha (1-4): ");
            escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo = deposito(saldo, valorDepositado);
                case 3 -> saldo = saque(saldo, valorSacado);
                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
    static void mostrarSaldo(double saldo){
        System.out.println("******************");
        System.out.printf("O saldo é R$%.2f\n", saldo);
        System.out.println("******************");
    }
    static double deposito(double saldo, double valorDepositado){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja depositar: ");
        valorDepositado = scanner.nextDouble();


        System.out.println("Valor depositado com sucesso!");

        return saldo + valorDepositado;
    }

    static double saque(double saldo, double valorSacado){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: ");
        valorSacado = scanner.nextDouble();


        System.out.println("Valor sacado com sucesso!");


        return saldo - valorSacado;
    }
}
