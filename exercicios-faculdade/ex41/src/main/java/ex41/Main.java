package ex41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int escolhaDoUsuario = 0;
        int opcaoDoUsuario = 0;

        System.out.println("******************************");
        System.out.println(" Escolha o tipo da sua conta ");
        System.out.println("******************************");
        do{
            System.out.print("Conta Corrente = 1 | Conta Poupança = 2: ");
            escolhaDoUsuario = scanner.nextInt();
        } while(escolhaDoUsuario != 1 && escolhaDoUsuario != 2);


        if(escolhaDoUsuario == 1) {
            Conta contaDoUsuario = new ContaCorrente("Conta Corrente do Usuário", 0, 19.99);
            do{
                System.out.println("1.Mostrar saldo");
                System.out.println("2.Fazer Depósito");
                System.out.println("3.Sair");
                System.out.print("Escolha uma opção: ");
                opcaoDoUsuario = scanner.nextInt();
                if(opcaoDoUsuario == 1) {
                    System.out.println("Seu saldo atual é: R$ " + contaDoUsuario.getSaldo());
                }
                else if(opcaoDoUsuario == 2){
                    System.out.print("Digite o valor para depósito em reais: ");
                    contaDoUsuario.setDeposito(scanner.nextDouble());
                }
                else if(opcaoDoUsuario == 3){
                    System.out.println("Obrigado pela preferência!");
                    break;
                }
            } while(opcaoDoUsuario == 1 || opcaoDoUsuario == 2 || opcaoDoUsuario == 3);


        }
        else if(escolhaDoUsuario == 2){
            Conta contaDoUsuario = new ContaPoupanca("Conta Poupança do Usuário", 0, 0.1);
            do{
                System.out.println("1.Mostrar saldo");
                System.out.println("2.Fazer Depósito");
                System.out.println("3.Sair");
                System.out.print("Escolha uma opção: ");
                opcaoDoUsuario = scanner.nextInt();
                if(opcaoDoUsuario == 1) {
                    System.out.println("Seu saldo atual é: R$ " + contaDoUsuario.getSaldo());
                }
                else if(opcaoDoUsuario == 2){
                    System.out.print("Digite o valor para depósito em reais: ");
                    contaDoUsuario.setDeposito(scanner.nextDouble());
                }
                else if(opcaoDoUsuario == 3){
                    System.out.println("Obrigado pela preferência!");
                    break;
                }
            } while(opcaoDoUsuario == 1 || opcaoDoUsuario == 2 || opcaoDoUsuario == 3);


        }

            scanner.close();
    }
}
