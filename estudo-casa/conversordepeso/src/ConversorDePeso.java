import java.util.Scanner;

public class ConversorDePeso {
    public static void main(String[] args){

        // Programa de conversor de Peso

        // Declaração das variáveis

        Scanner scanner = new Scanner(System.in);
        int escolhaDaOpcao;
        double peso;
        double calculoDoPesoConvertido;

        //  Mensagem inicial contextualizada

        System.out.println("Programa de conversor de Peso");
        System.out.println("1: converte de libras para kilogramas");
        System.out.println("2: converte de kilogramas para libras");

        // entrada do usuário: escolha entre as opções

        System.out.print("Escolha uma opção: ");
        escolhaDaOpcao = scanner.nextInt();

        //opção 1

        if(escolhaDaOpcao == 1){
            System.out.print("Digite o peso em libras: ");
            peso = scanner.nextDouble();
            calculoDoPesoConvertido = peso/2.2046;
            System.out.printf("O novo peso em kilogramas é: %.2f", calculoDoPesoConvertido);
        }

        // opção 2

        else if(escolhaDaOpcao == 2){
            System.out.print("Digite o peso em kilogramas: ");
            peso = scanner.nextDouble();
            calculoDoPesoConvertido = peso*2.2046;
            System.out.printf("O novo peso em libras é: %.2f", calculoDoPesoConvertido);
        }

        // opção inválida

        else{
            System.out.println("Não é um opção válida!");
        }



        scanner.close();
    }
}
