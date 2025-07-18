import java.sql.SQLOutput;
import java.util.Scanner;

public class ex1021 {
    public static void main(String[] args){

        /* Leia um valor de ponto flutuante com duas casas decimais.
         Este valor representa um valor monetário.
         A seguir, calcule o menor número de notas
         e moedas possíveis no qual o valor pode ser decomposto.
         As notas consideradas são de 100, 50, 20, 10, 5, 2.
         As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
         A seguir mostre a relação de notas necessárias.
         */

        Scanner scanner = new Scanner(System.in);
        double valorDigitado;
        int contagemNotas100, contagemNotas50, contagemNotas20, contagemNotas10, contagemNotas5, contagemNotas2;
        double contagemMoedas1, contagemMoedas50cents, contagemMoedas25cents, contagemMoedas10cents, contagemMoedas5cents, contagemMoedas1cent;


        System.out.print("Digite um valor com 2 casas decimais: ");
        valorDigitado = scanner.nextDouble();

        while(valorDigitado <= 0){
            System.out.println("O valor digitado deve ser positivo");
            System.out.print("Digite um valor com 2 casas decimais: ");
            valorDigitado = scanner.nextDouble();
        }
        if(valorDigitado > 0){
            contagemNotas100 = (int) valorDigitado / 100;
            contagemNotas50 = (int) (valorDigitado % 100) / 50;
            contagemNotas20 = (int) ((valorDigitado % 100) % 50) / 20;
            contagemNotas10 = (int) (((valorDigitado % 100) % 50) % 20) / 10;
            contagemNotas5 = (int) ((((valorDigitado % 100) % 50) % 20) % 10) / 5;
            contagemNotas2 = (int) (((((valorDigitado % 100) % 50) % 20) % 10) % 5) / 2;
            contagemMoedas1 = (int) ((((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2) / 1;
            contagemMoedas50cents = (int) (((((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.5;
            contagemMoedas25cents = (int) ((((((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.5) / 0.25;
            contagemMoedas10cents = (int) (((((((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.5) % 0.25) / 0.10;
            contagemMoedas5cents = (int) ((((((((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.5) % 0.25) % 0.10) / 0.05;
            contagemMoedas1cent =  (int) ((((((((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.5) % 0.25) % 0.10) % 0.05;
            System.out.println("NOTAS: ");
            System.out.println(contagemNotas100 + " nota(s) de R$ 100,00");
            System.out.println(contagemNotas50 + " nota(s) de R$ 50,00");
            System.out.println(contagemNotas20 + " nota(s) de R$ 20,00");
            System.out.println(contagemNotas10 + " nota(s) de R$ 10,00");
            System.out.println(contagemNotas5 + " nota(s) de R$ 5,00");
            System.out.println(contagemNotas2 + " nota(s) de R$ 2,00");
            System.out.println("MOEDAS: ");
            System.out.println(contagemMoedas1 + " moeda(s) de 1,00");
            System.out.println(contagemMoedas50cents + " moeda(s) de 0,50");
            System.out.println(contagemMoedas25cents + " moeda(s) de 0,25");
            System.out.println(contagemMoedas10cents + " moeda(s) de 0,10");
            System.out.println(contagemMoedas5cents + " moeda(s) de 0,05");
            System.out.println(contagemMoedas1cent + " moeda(s) de 0,01");
        }



        scanner.close();
    }
}
