import java.util.Scanner;

public class ex1172 {
    public static void main(String[] args){

        /*Faça um programa que leia um vetor X[10].
         Substitua a seguir, todos os valores nulos e negativos do vetor X por 1.
         Em seguida mostre o vetor X.
         */

        Scanner scanner = new Scanner(System.in);
        int vetorX[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número inteiro qualquer: ");
            vetorX[i] = scanner.nextInt();
            if(vetorX[i] <= 0){
                vetorX[i] = 1;
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.println("x[" + i + "] = " + vetorX[i]);
        }




    }
}
