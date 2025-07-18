import java.util.Scanner;

public class ex1012 {
    public static void main(String[] args){
        /*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        System.out.print("Digite o lado A: ");
        a = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        b = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        c = scanner.nextDouble();

        areaTriangulo = (a*c)/2;
        areaCirculo = Math.PI * Math.pow(c, 2);
        areaTrapezio = ((a + b)*c)/2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a*b;

        System.out.printf("Área do triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Área do triângulo: %.3f\n", areaCirculo);
        System.out.printf("Área do triângulo: %.3f\n", areaTrapezio);
        System.out.printf("Área do triângulo: %.3f\n", areaQuadrado);
        System.out.printf("Área do triângulo: %.3f\n", areaRetangulo);


        scanner.close();

    }
}
