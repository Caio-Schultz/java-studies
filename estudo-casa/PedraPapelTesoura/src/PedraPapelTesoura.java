import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args){

        // Programa pedra, papel, tesoura

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String movimentoUsuario;
        String opcoes[] = {"pedra", "papel", "tesoura"};
        String movimentoComputador;
        String continuar;

        do{
            System.out.print("Digite seu movimento (pedra, papel, tesoura): ");
            movimentoUsuario = scanner.nextLine();

            movimentoComputador = opcoes[random.nextInt(opcoes.length)];

            while(!movimentoUsuario.equalsIgnoreCase("pedra") && !movimentoUsuario.equalsIgnoreCase("tesoura") && !movimentoUsuario.equalsIgnoreCase("papel")){
                System.out.println("Seu movimento deve ser pedra, papel ou tesoura!");
                System.out.print("Digite seu movimento (pedra, papel, tesoura): ");
                movimentoUsuario = scanner.nextLine();
            }

            System.out.println("Escolha do computador: " + movimentoComputador);
            if (movimentoUsuario.equalsIgnoreCase(movimentoComputador)) {
                System.out.println("Empate");
            }
            else if((movimentoUsuario.equalsIgnoreCase("papel") && movimentoComputador.equalsIgnoreCase(opcoes[0])) || (movimentoUsuario.equalsIgnoreCase("tesoura") && movimentoComputador.equals(opcoes[1])) || (movimentoUsuario.equalsIgnoreCase("pedra") && movimentoComputador.equals(opcoes[2]))){
                System.out.println("Você ganhou!");
            }
            else {
                System.out.println("Você perdeu!");
            }


            System.out.print("Jogar de novo (sim/não): ");
            continuar = scanner.nextLine();
        } while(!continuar.equalsIgnoreCase("não"));

        System.out.println("Obrigado por jogar!");




        scanner.close();
    }
}
