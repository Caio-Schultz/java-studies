import java.util.Scanner;

public class ex1002 {
    public static void main(String[] args){
        /*A fórmula para calcular a área de uma circunferência é: area = π . raio2.
         Considerando para este problema que π = 3.14159:
         - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
         */

        Scanner scanner = new Scanner(System.in);
        double raio;
        double area;

        System.out.print("Digite o raio da circunferência: ");
        raio = scanner.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Área = %.2f", area);



    }
}
