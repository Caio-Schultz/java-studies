import java.util.Scanner;

public class ex1075 {
    public static void main(String[] args){

        /*Leia um valor inteiro N.
         Apresente todos os números entre 1 e 10000 que divididos
          por N dão resto igual a 2.
         */

        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Digite um número inteiro menor que 10000: ");
        N = scanner.nextInt();

        for(int i = 1; i <= 10000; i++){
            if((i % N) == 2){
                System.out.println(i);
            }
        }


        scanner.close();


    }
}
