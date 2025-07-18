import java.util.Scanner;

public class ex1070 {
    public static void main(String[] args){

        /*Leia um valor inteiro X.
         Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
         um valor por linha, inclusive o X ser for o caso.
         */

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Digite um valor positivo inteiro qualquer: ");
        x = scanner.nextInt();

        for(int i = x; i < (x + 11);i+=2){
            if((x % 2) == 1){
                System.out.println(i);
            }
            else{
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}
