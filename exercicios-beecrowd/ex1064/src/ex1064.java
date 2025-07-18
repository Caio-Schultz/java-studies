import java.util.Scanner;

public class ex1064 {
    public static void main(String[] args){

        /*Leia 6 valores.
         Em seguida, mostre quantos destes valores digitados foram positivos.
         Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
         com um dígito após o ponto decimal.
         */

        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[6];
        double media;
        int contagemDePositivos = 0;
        double soma = 0;
        for(int i = 0; i < 6; i++){
            System.out.print("Digite um número qualquer: ");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > 0){
                contagemDePositivos = contagemDePositivos + 1;
                soma = soma + numeros[i];
            }
        }
        media = soma/contagemDePositivos;

        System.out.println(contagemDePositivos + " é a quantidade de números positivos!");
        System.out.printf("%.1f é a média dos valores positivos!", media);
        scanner.close();
    }
}
