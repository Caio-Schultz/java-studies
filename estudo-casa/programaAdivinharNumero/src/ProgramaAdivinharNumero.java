import java.util.Random;
import java.util.Scanner;

public class ProgramaAdivinharNumero {
    public static void main(String[] args){


        Random random = new Random();   // objeto "Random" consegue fazer um número aleatório
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(1, 101); // vai gerar um número aleatório entre 1-100 (o segundo número entre parênteses deve ser 1 a mais do que o pretendido pq ele é excluído
        int numeroTentado = 0;
        int tentativas = 0;


        System.out.println("Jogo de adivinhar o número!");
        System.out.println("---------------------------------");


        System.out.println("Adivinhe um número entre 1-100");
        System.out.print("Escolha um número: ");
        numeroTentado = scanner.nextInt();


        do {
            while (numeroTentado > numeroAleatorio){
                if (numeroTentado < 101) {
                    System.out.println("Muito alto! Tente de novo");
                    System.out.print("Escolha outro número: ");
                    numeroTentado = scanner.nextInt();
                    tentativas = tentativas + 1;
                } else {
                    System.out.println("O número escolhido deve ser entre 1-100");
                    System.out.print("Escolha outro número: ");
                    numeroTentado = scanner.nextInt();
                    tentativas = tentativas + 1;
                }
            }

            while (numeroTentado < numeroAleatorio) {
                if (numeroTentado > 0) {
                    System.out.println("Muito baixo! Tente de novo");
                    System.out.print("Escolha outro número: ");
                    numeroTentado = scanner.nextInt();
                    tentativas = tentativas + 1;
                } else {
                    System.out.println("O número escolhido deve ser entre 1-100");
                    System.out.print("Escolha outro número: ");
                    numeroTentado = scanner.nextInt();
                    tentativas = tentativas + 1;
                }
            }

        } while (numeroTentado != numeroAleatorio);


        if(numeroTentado == numeroAleatorio){
            System.out.println("Você acertou! O número é: " + numeroAleatorio);
            tentativas = tentativas + 1;
        }

        System.out.println("Tentativas até acertar: " + tentativas);

        scanner.close();
    }
}
