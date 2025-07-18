import java.util.Scanner;

public class ex1175 {
    public static void main(String[] args){

        /*Faça um programa que leia um vetor N[20].
         Troque a seguir, o primeiro elemento com o último,
         o segundo elemento com o penúltimo, etc.,
         até trocar o 10º com o 11º. Mostre o vetor modificado.
         */

        Scanner scanner = new Scanner(System.in);
        int vetorN[] = new int[20];

        for(int i = 0; i < 20; i++){
            System.out.print("Digite um valor inteiro qualquer: ");
            vetorN[i] = scanner.nextInt();
        }

        for(int i = 0; i < 20; i++){
            for(int j = 19; j > -1; j--){
                vetorN[i] = vetorN[j];
            }
        }

        for(int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %d\n", i, vetorN[i]);
        }







        scanner.close();
    }
}
