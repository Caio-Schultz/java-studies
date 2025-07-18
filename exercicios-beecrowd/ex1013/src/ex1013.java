import java.util.Scanner;

public class ex1013 {
    public static void main(String[] args){
        /*Faça um programa que leia três valores e apresente o maior dos três valores
         lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
         Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b).
         Um segundo passo, portanto é necessário para chegar no resultado esperado.
         */

        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[3];
        double maiorNumero = -10000000;




        for(int i = 0; i < 3; i++){
            System.out.print("Digite um valor qualquer: ");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }

        System.out.println(maiorNumero + " é o maior!");

        scanner.close();
    }
}
