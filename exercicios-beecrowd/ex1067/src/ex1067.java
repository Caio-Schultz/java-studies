import java.util.Scanner;

public class ex1067 {
    public static void main(String[] args){

        /*Leia um valor inteiro X (1 <= X <= 1000).
         Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
         */

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Digite um número qualquer entre 1 e 1000: ");
        x = scanner.nextInt();

        for(int i = 0; i <= x; i++){
            if((i % 2) == 1 && (i <= x)){
                System.out.println(i);
            }
        }
    }
}
