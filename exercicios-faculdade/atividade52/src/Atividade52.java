
import java.util.Scanner;

public class Atividade52 {
    public static void main(String[] args){
        /*O preço final ao consumidor de um computador é o resultante da soma do
        custo da fábrica acrescido do percentual referente aos impostos, mais a
        comissão do vendedor, mais o percentual de lucro da revenda. Ainda é
        possível, no momento da venda oferecer um desconto ao cliente, entretanto o
        percentual do desconto não incide sobre os impostos. Elabore um sistema que
        mantenha uma tabela com a descrição e os preços de 5 computadores e receba
        as demais informações, calculando o preço final a ser pago pelo cliente.
         */




        String matrizComputadores[][] = new String[5][2];
        matrizComputadores[0][0] = "Computador Desktop i7";
        matrizComputadores[0][1] = "4000.50";
        matrizComputadores[1][0] = "Computador Desktop i5";
        matrizComputadores[1][1] = "3000.00";
        matrizComputadores[2][0] = "Computador Desktop i3";
        matrizComputadores[2][1] = "2000.50";
        matrizComputadores[3][0] = "Computador Notebook i7";
        matrizComputadores[3][1] = "4500.50";
        matrizComputadores[4][0] = "Computador i5";
        matrizComputadores[4][1] = "3500.00";

        Scanner scanner = new Scanner(System.in);


        System.out.print("Qual computador você quer levar?: ");
        String computadorCliente = scanner.nextLine();

        System.out.print("Digite o percentual do imposto: ");
        double percentualImposto = scanner.nextDouble();
        System.out.print("Digite a comissão do vendedor: ");
        double comissaoVendedor = scanner.nextDouble();
        System.out.print("Digite o percentual de lucro de revenda: ");
        double lucroRevenda = scanner.nextDouble();
        System.out.print("Digite o desconto sobre o produto: ");
        double descontoProduto = scanner.nextDouble();

        // limpeza de buffer pra não duplicar
        scanner.nextLine();

        double somaDosAumentos = (comissaoVendedor/100) + (lucroRevenda/100);

        while(!computadorCliente.equalsIgnoreCase(matrizComputadores[0][0]) && !computadorCliente.equalsIgnoreCase(matrizComputadores[1][0]) && !computadorCliente.equalsIgnoreCase(matrizComputadores[2][0]) && !computadorCliente.equalsIgnoreCase(matrizComputadores[3][0]) && !computadorCliente.equalsIgnoreCase(matrizComputadores[4][0])){
            System.out.println("Você errou na digitação do item ou o item digitado não tem em estoque!\nTente digitar novamente ou insira um produto diferente");
            System.out.println("Qual computador você quer levar?: ");
            computadorCliente = scanner.nextLine();
        }

        if (computadorCliente.equalsIgnoreCase(matrizComputadores[0][0])) {
                double preco = Double.parseDouble(matrizComputadores[0][1]);
                preco = preco * (1 + somaDosAumentos);
                preco = preco * (1 - (descontoProduto / 100));
                preco = preco * (1 + (percentualImposto / 100));
                System.out.printf("O preço do computador é: R$%.2f", preco);
        }
        else if (computadorCliente.equalsIgnoreCase(matrizComputadores[1][0])){
            double preco = Double.parseDouble(matrizComputadores[1][1]);
            preco = preco * (1 + somaDosAumentos);
            preco = preco * (1 - (descontoProduto / 100));
            preco = preco * (1 + (percentualImposto / 100));
            System.out.printf("O preço do computador é: %.2f", preco);
        }
        else if (computadorCliente.equalsIgnoreCase(matrizComputadores[2][0])){
            double preco = Double.parseDouble(matrizComputadores[2][1]);
            preco = preco * (1 + somaDosAumentos);
            preco = preco * (1 - (descontoProduto / 100));
            preco = preco * (1 + (percentualImposto / 100));
            System.out.printf("O preço do computador é: %.2f", preco);
        }
        else if (computadorCliente.equalsIgnoreCase(matrizComputadores[3][0])){
            double preco = Double.parseDouble(matrizComputadores[3][1]);
            preco = preco * (1 + somaDosAumentos);
            preco = preco * (1 - (descontoProduto / 100));
            preco = preco * (1 + (percentualImposto / 100));
            System.out.printf("O preço do computador é: %.2f", preco);
        }
        else if (computadorCliente.equalsIgnoreCase(matrizComputadores[4][0])){
            double preco = Double.parseDouble(matrizComputadores[4][1]);
            preco = preco * (1 + somaDosAumentos);
            preco = preco * (1 - (descontoProduto / 100));
            preco = preco * (1 + (percentualImposto / 100));
            System.out.printf("O preço do computador é: %.2f", preco);
        }




        scanner.close();
    }
}
