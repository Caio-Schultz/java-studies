import java.util.Scanner;
public class ex1060 {
    public static void main(String[] args){

        /*
          Faça um programa que leia 6 valores.
          Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
          A seguir, mostre a quantidade de valores positivos digitados.
         */

        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[6];
        int contagemDePositivos = 0;

        for(int i = 0; i < 6; i++){
            System.out.print("Digite um número qualquer: ");
            numeros[i] = scanner.nextDouble();
            if(numeros[i] > 0){
                contagemDePositivos = contagemDePositivos + 1;
            }
        }
        System.out.println(contagemDePositivos + " é a quantidade de números positivos!");



        scanner.close();
    }
}
