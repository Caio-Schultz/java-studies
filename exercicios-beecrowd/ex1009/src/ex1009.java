import java.util.Scanner;

public class ex1009 {
    public static void main(String[] args){
        /*Faça um programa que leia o nome de um vendedor,
         o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
         Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
         informar o total a receber no final do mês, com duas casas decimais.
         */

       Scanner scanner = new Scanner(System.in);
       String nomeVendedor;
       double salarioFixo;
       double totalDeVendasNoMes;
       double salarioFinal;

        System.out.print("Digite seu nome: ");
        nomeVendedor = scanner.nextLine();
        System.out.print("Digite seu salário fixo: ");
        salarioFixo = scanner.nextDouble();
        System.out.print("Digite o valor total de vendas que você efetuou no mês: ");
        totalDeVendasNoMes = scanner.nextDouble();

        salarioFinal = salarioFixo + (totalDeVendasNoMes*0.15);

        System.out.printf("Salário total = %.2f", salarioFinal);




       scanner.close();

    }
}
