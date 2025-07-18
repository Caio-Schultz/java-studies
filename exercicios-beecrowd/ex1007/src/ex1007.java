import java.util.Scanner;

public class ex1007 {
    public static void main(String[] args){
        /*Leia quatro valores inteiros A, B, C e D.
         A seguir, calcule e mostre a diferença do produto de A e B
         pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int diferenca;

        System.out.print("Digite um número inteiro qualquer: ");
        num1 = scanner.nextInt();
        System.out.print("Digite um número inteiro qualquer: ");
        num2 = scanner.nextInt();
        System.out.print("Digite um número inteiro qualquer: ");
        num3 = scanner.nextInt();
        System.out.print("Digite um número inteiro qualquer: ");
        num4 = scanner.nextInt();

        diferenca = (num1*num2) - (num3*num4);

        System.out.println("Diferença = " + diferenca);
    }
}
