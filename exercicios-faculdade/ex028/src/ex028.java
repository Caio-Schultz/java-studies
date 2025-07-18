import java.util.Scanner;

public class ex028 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int matrizNumeros[][] = new int[3][3];
        int i;
        int j;
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        int produto1 = 1;

        for(i = 0; i < 3;i++){
            for (j = 0; j < 3;j++){
                System.out.print("Digite o número inteiro da linha " + i + " e na coluna " + j + ": ");
                matrizNumeros[i][j] = scanner.nextInt();
            }
        }

        for(i = 0; i < 3;i++){
            for(j = 0; j < 1;j++){
                soma1 = soma1 + matrizNumeros[i][0];
            }
            for(j = 1; j < 2;j++){
                soma2 = soma2 + matrizNumeros[i][1];
            }
            for(j = 2; j < 3;j++){
                soma3 = soma3 + matrizNumeros[i][2];
            }
        }

        for(i = 0; i < 1; i++){
            for (j = 0; j < 3; j++){
                produto1 = produto1 * matrizNumeros[0][j];
            }
        }

        System.out.println("A soma da primeira coluna é: " + soma1);
        System.out.println("A soma da segunda coluna é: " + soma2);
        System.out.println("A soma da terceira coluna é: " + soma3);
        System.out.println("O produto da primeira linha é: " + produto1);


        scanner.close();
    }
}
