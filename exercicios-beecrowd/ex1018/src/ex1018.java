import java.util.Scanner;

public class ex1018 {
    public static void main(String[] args){
        /*Leia um valor inteiro.
         A seguir, calcule o menor número de notas possíveis (cédulas)
         no qual o valor pode ser decomposto.
         As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
         A seguir mostre o valor lido e a relação de notas necessárias.
         */

        Scanner scanner = new Scanner(System.in);
        int valorDigitado;
        int contagemDeNotas100;
        int contagemDeNotas50;
        int contagemDeNotas20;
        int contagemDeNotas10;
        int contagemDeNotas5;
        int contagemDeNotas2;
        int contagemDeNotas1;

        System.out.print("Digite um valor inteiro qualquer: ");
        valorDigitado = scanner.nextInt();

        if(valorDigitado >= 100){
            contagemDeNotas100 = valorDigitado / 100;
            contagemDeNotas50 = (valorDigitado % 100) / 50;
            contagemDeNotas20 = ((valorDigitado % 100) % 50) / 20;
            contagemDeNotas10 = (((valorDigitado % 100) % 50) % 20) / 10;
            contagemDeNotas5 = ((((valorDigitado % 100) % 50) % 20) % 10) / 5;
            contagemDeNotas2 = (((((valorDigitado % 100) % 50) % 20) % 10) % 5) / 2;
            contagemDeNotas1 = (((((valorDigitado % 100) % 50) % 20) % 10) % 5) % 2;
            System.out.println(contagemDeNotas100 + " nota(s) de R$ 100,00");
            System.out.println(contagemDeNotas50 + " nota(s) de R$ 50,00");
            System.out.println(contagemDeNotas20 + " nota(s) de R$ 20,00");
            System.out.println(contagemDeNotas10 + " nota(s) de R$ 10,00");
            System.out.println(contagemDeNotas5 + " nota(s) de R$ 5,00");
            System.out.println(contagemDeNotas2 + " nota(s) de R$ 2,00");
            System.out.println(contagemDeNotas1 + " nota(s) de R$ 1,00");
        }


        scanner.close();
    }
}
