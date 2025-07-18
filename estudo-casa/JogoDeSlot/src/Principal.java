import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double saldoDaConta = 100;
        double apostaDoUsuario;
        String continuar;
        String simbolos[] = {"\uD83C\uDF52", "\uD83C\uDF49", "\uD83C\uDF4B", "\uD83D\uDD14", "\u2B50"};
        String simboloAleatorio;
        String simboloAleatorio2;
        String simboloAleatorio3;


        System.out.println("*******************************");
        System.out.println("Bem-vindo ao jogo do Slot \uD83C\uDFB0"); // emoji jogo de slot
        System.out.println("Símbolos: \uD83C\uDF52 \uD83C\uDF49 \uD83C\uDF4B \uD83D\uDD14 \u2B50");
        System.out.println("Regras: Você ganha se cair 2 ou mais símbolos iguais!");
        System.out.println("*******************************");


        do {
            System.out.printf("Saldo atual: R$%.2f\n", saldoDaConta);

            System.out.print("Digite o valor que você quer apostar: ");
            apostaDoUsuario = scanner.nextDouble();

            while (apostaDoUsuario <= 0 || apostaDoUsuario > saldoDaConta) {
            System.out.println("A aposta deve ser feita com um valor positivo\ne não pode ultrapassar o valor do saldo da conta!");
            System.out.print("Digite o valor que você quer apostar: ");
            apostaDoUsuario = scanner.nextDouble();
            }

            scanner.nextLine(); // limpando o buffer

            System.out.println("Girando a roleta...");
            System.out.println("*************");
            simboloAleatorio = simbolos[random.nextInt(simbolos.length)];
            simboloAleatorio2 = simbolos[random.nextInt(simbolos.length)];
            simboloAleatorio3 = simbolos[random.nextInt(simbolos.length)];
            System.out.println(simboloAleatorio + " | " + simboloAleatorio2 + " | " + simboloAleatorio3);
            System.out.println("*************");
            if((!simboloAleatorio.equalsIgnoreCase(simboloAleatorio2)) &&
                    (!simboloAleatorio.equalsIgnoreCase(simboloAleatorio3)) &&
                    (!simboloAleatorio2.equalsIgnoreCase(simboloAleatorio3))){
                System.out.println("Você perdeu esse round \uD83D\uDE14");
                saldoDaConta = saldoDaConta - apostaDoUsuario;
            }
            else if ((simboloAleatorio.equalsIgnoreCase(simboloAleatorio2)) &&
                    ((simboloAleatorio.equalsIgnoreCase(simboloAleatorio3)))){
                System.out.println("Os três símbolos estão certos!\nVocê GANHOU a recompensa em dobro! \uD83C\uDFB0");
                saldoDaConta = (saldoDaConta - apostaDoUsuario) + (apostaDoUsuario * 2);
            }
            else{
                System.out.println("Dois símbolos foram iguais! Você ganhou! \uD83D\uDE01");
                saldoDaConta = (saldoDaConta - apostaDoUsuario) + (apostaDoUsuario * 1.5);
            }


            if(saldoDaConta > 0){
                System.out.print("Deseja continuar?: (sim/não) ");
                continuar = scanner.nextLine();
            }
            else{
                break;
            }
        }while(!continuar.equalsIgnoreCase("não"));

        System.out.printf("Obrigado por jogar! Seu saldo final foi: %.2f", saldoDaConta);


        scanner.close();
    }
}
