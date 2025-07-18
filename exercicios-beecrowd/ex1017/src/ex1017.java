import java.util.Scanner;

public class ex1017 {
    public static void main(String[] args){
        /*Joaozinho quer calcular e mostrar a quantidade de litros
         de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L.
         Para isso, ele gostaria que você o auxiliasse através de um simples programa.
         Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas)
         e a velocidade média durante a mesma (em km/h).
         Assim, pode-se obter distância percorrida e, em seguida,
         calcular quantos litros seriam necessários.
         Mostre o valor com 3 casas decimais após o ponto.
         */

        Scanner scanner = new Scanner(System.in);
        int tempoGastoDaViagem;
        int velocidadeMedia;
        int distanciaPercorrida;
        double litrosNecessarios;

        System.out.print("Qual foi o tempo total gasto na viagem? (em horas): ");
        tempoGastoDaViagem = scanner.nextInt();

        System.out.print("Qual foi a velocidade média? (em km/h): ");
        velocidadeMedia = scanner.nextInt();

        distanciaPercorrida = tempoGastoDaViagem*velocidadeMedia;

        litrosNecessarios = distanciaPercorrida/12.0;

        System.out.printf("%.3f L", litrosNecessarios);

        scanner.close();
    }
}
