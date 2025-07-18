import java.util.Scanner;

public class ex1065 {
    public static void main(String[] args){

        /*Faça um programa que leia 5 valores inteiros.
         Conte quantos destes valores digitados
          são pares e mostre esta informação.
         */

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        int contagemDePares = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um número qualquer: ");
            numeros[i] = scanner.nextInt();
            if(((numeros[i] % 2) == 0) && (numeros[i] != 0)){
                contagemDePares++;
            }

        }
        System.out.println("A quantidade de números pares é: " + contagemDePares);

        scanner.close();
    }
}
