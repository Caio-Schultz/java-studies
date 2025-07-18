import java.util.Scanner;

public class ex1003 {
    public static void main(String[] args){

        /*Leia dois valores inteiros, no caso para variáveis A e B.
         A seguir, calcule a soma entre elas e atribua à variável SOMA.
          A seguir escrever o valor desta variável.
         */

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.print("Digite um número inteiro qualquer: ");
        num1 = scanner.nextInt();
        System.out.print("Digite um número inteiro qualquer: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);

        scanner.close();

    }
}
