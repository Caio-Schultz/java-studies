import java.util.Scanner;
public class Carrinhomercado {
    public static void main(String[] args){

        /* Carrinho de mercado
        O programa vai pedir o item que você quer comprar
        quanto custa uma unidade do item
        e quantos itens você quer comprar
         */
        Scanner scanner = new Scanner(System.in);
        String item;
        double precoProduto, totalDaCompra;
        int quantidadeDeItens;


        System.out.print("Qual item você quer comprar?: ");
        item = scanner.nextLine();

        System.out.print("Quanto custa esse produto?: ");
        precoProduto = scanner.nextDouble();

        System.out.print("Qual número de " + item + " você quer levar?: ");
        quantidadeDeItens = scanner.nextInt();

        totalDaCompra = quantidadeDeItens*precoProduto;

        System.out.println("\nVocê comprou " + quantidadeDeItens + " " + item + "/s");
        System.out.println("O total da compra foi R$" + totalDaCompra);


        scanner.close();
    }
}
