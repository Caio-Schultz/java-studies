import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        // for loop = executa um código em um número ESPECÍFICO de vezes

        Scanner scanner = new Scanner(System.in);

     /*   for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.print("Digite quantas vezes você quer fazer o loop: ");
        int max = scanner.nextInt();

        for (int i = 0; i < max; i++){
            System.out.println("Oi, você está em um loop!");
        }
      */

        int start = 10;

        for (int i = start; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("FELIZ ANO NOVO!");


        scanner.close();
    }
}
