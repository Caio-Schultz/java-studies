import java.util.Scanner;

public class ex1010 {
    public static void main(String[] args){

        /*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
         o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
          e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
         */

        Scanner scanner = new Scanner(System.in);
        int codigoDaPeca1, codigoDaPeca2;
        int numeroDePeca1, numeroDePeca2;
        double valorUnitarioDaPeca1, valorUnitarioDaPeca2;
        double valorASerPago;

        System.out.print("Digite o código da primeira peça: ");
        codigoDaPeca1 = scanner.nextInt();
        System.out.print("Digite o número de peças que você deseja levar: ");
        numeroDePeca1 = scanner.nextInt();
        System.out.print("Digite o valor unitário de cada peça: ");
        valorUnitarioDaPeca1 = scanner.nextDouble();

        System.out.print("Digite o código da segunda peça: ");
        codigoDaPeca2 = scanner.nextInt();
        System.out.print("Digite o número de peças que você deseja levar: ");
        numeroDePeca2 = scanner.nextInt();
        System.out.print("Digite o valor unitário de cada peça: ");
        valorUnitarioDaPeca2 = scanner.nextDouble();

        valorASerPago = (numeroDePeca1*valorUnitarioDaPeca1) + (numeroDePeca2*valorUnitarioDaPeca2);

        System.out.printf("Valor a pagar: R$%.2f", valorASerPago);




        scanner.close();
    }
}
