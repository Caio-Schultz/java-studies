import java.util.Scanner;

public class ex1001 {
    public static void main(String[] args){
        /*Leia 2 valores inteiros e armazene-os nas variáveis A e B.
         Efetue a soma de A e B atribuindo o seu resultado na variável X.
         Imprima X conforme exemplo apresentado abaixo.
         Não apresente mensagem alguma além daquilo que está sendo especificado
         e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
         você receberá "Presentation Error".
         */

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int x;

        System.out.print("Digite um número inteiro qualquer: ");
        a = scanner.nextInt();
        System.out.print("Digite outro número inteiro qualquer: ");
        b = scanner.nextInt();

        x = a + b;

        System.out.println("X = " + x);

        scanner.close();




    }
}
