import java.util.Scanner;

public class ex1073 {
    public static void main(String[] args){
        /*Leia um valor inteiro N.
         Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N,
         se for o caso.
         */

        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Digite um número inteiro entre 5 e 2000: ");
        N = scanner.nextInt();

        for(int i = 0; i <= N; i+=2){
            if((i % 2) == 0 && (i != 0)){
                System.out.println(i + "^2 = " + Math.pow(i, 2));
            }
        }



        scanner.close();

    }
}
