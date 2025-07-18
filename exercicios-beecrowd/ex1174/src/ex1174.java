import java.util.Scanner;

public class ex1174 {
    public static void main(String[] args){

        /*Faça um programa que leia um vetor A[100].
         No final, mostre todas as posições do vetor que armazenam
         um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
         */

        Scanner scanner = new Scanner(System.in);
        double vetorA[] = new double[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um valor qualquer: ");
            vetorA[i] = scanner.nextDouble();
        }

        for(int i = 0; i < 10; i++){
            if(vetorA[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, vetorA[i]);
            }
        }




        scanner.close();
    }
}
