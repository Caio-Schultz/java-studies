import java.util.Scanner;

public class ex1011 {
    public static void main(String[] args){
        /*Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido
         o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3.
         Considere (atribua) para pi o valor 3.14159.
         Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3),
         pois algumas linguagens (dentre elas o C++),
         assumem que o resultado da divisão entre dois inteiros é outro inteiro.
         */

        Scanner scanner = new Scanner(System.in);
        double raio;
        double volume;

        System.out.print("Digite o raio da circunferência: ");
        raio = scanner.nextDouble();

        volume = (4.0/3) * Math.PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", volume);



        scanner.close();


    }
}
