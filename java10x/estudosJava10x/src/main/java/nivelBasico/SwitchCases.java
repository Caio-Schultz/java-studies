package nivelBasico;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        /*
        Switch cases: servem para gerar casos específicos
        Objetivo: Pedir pro usuário escolher entre os Ninjas
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto, o ninja principal!");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke, o ninja com mais raiva!");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura, a ninja mais forte!");
                break;
            default:
                System.out.println("Você não escolheu nenhum ninja");
                break;
        }

        scanner.close();
    }
}
