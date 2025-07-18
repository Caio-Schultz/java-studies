import java.util.Scanner;

public class ex1066 {
    public static void main(String[] args){
        /*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
         quantos valores digitados foram ímpares,
          quantos valores digitados foram positivos e quantos valores digitados foram negativos.
         */

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        int contagemDePositivos = 0;
        int contagemDeNegativos = 0;
        int contagemDePar = 0;
        int contagemDeImpar = 0;
        int contagemFastasma = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um número qualquer: ");
            numeros[i] = scanner.nextInt();
            if(numeros[i] > 0){
                contagemDePositivos++;
            }
            else if(numeros[i] == 0){
                contagemFastasma = contagemFastasma*1;
            }
            else{
                contagemDeNegativos++;
            }
            if((numeros[i] % 2) == 0){
                if(numeros[i] != 0){
                contagemDePar++;
            }
            }
            else{
                contagemDeImpar++;
            }
        }
        System.out.println(contagemDePar + " valores pares!");
        System.out.println(contagemDeImpar + " valores ímpares!");
        System.out.println(contagemDePositivos + " valores positivos!");
        System.out.println(contagemDeNegativos + " valores negativos!");
        scanner.close();
    }
}
