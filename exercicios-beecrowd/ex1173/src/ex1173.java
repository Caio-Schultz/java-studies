import java.util.Scanner;

public class ex1173 {
    public static void main(String[] args){

        /*Leia um valor e faça um programa que coloque
         o valor lido na primeira posição de um vetor N[10].
         Em cada posição subsequente,
         coloque o dobro do valor da posição anterior.
         Por exemplo, se o valor lido for 1,
         os valores do vetor devem ser 1,2,4,8
         e assim sucessivamente. Mostre o vetor em seguida.
         */

        Scanner scanner = new Scanner(System.in);
        int valorDigitado;
        int vetorN[] = new int[10];


        for (int i = 0; i < 10; i++){

        }
        System.out.print("Digite um número inteiro entre -50 e 50: ");
        valorDigitado = scanner.nextInt();

        vetorN[0] = valorDigitado;
        vetorN[1] = valorDigitado * 2;
        vetorN[2] = vetorN[1] * 2;
        vetorN[3] = vetorN[2] * 2;
        vetorN[4] = vetorN[3] * 2;
        vetorN[5] = vetorN[4] * 2;
        vetorN[6] = vetorN[5] * 2;
        vetorN[7] = vetorN[6] * 2;
        vetorN[8] = vetorN[7] * 2;
        vetorN[9] = vetorN[8] * 2;



        for (int i = 0; i < 10; i++){
            System.out.println("N[" + i + "] = " + vetorN[i]);
        }



        scanner.close();
    }
}
