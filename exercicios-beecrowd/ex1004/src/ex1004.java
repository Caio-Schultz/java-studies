import java.util.Scanner;

public class ex1004 {
    public static void main(String[] args){
            /*
            Leia dois valores inteiros.
            A seguir, calcule o produto entre estes dois valores e atribua
            esta operação à variável PROD.
            A seguir mostre a variável PROD com mensagem correspondente.
             */

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int produto;

        System.out.print("Digite um número inteiro qualquer: ");
        num1 = scanner.nextInt();
        System.out.print("Digite um número inteiro qualquer: ");
        num2 = scanner.nextInt();

        produto = num1*num2;

        System.out.println("PRODUTO = " + produto);




        scanner.close();
    }
}
