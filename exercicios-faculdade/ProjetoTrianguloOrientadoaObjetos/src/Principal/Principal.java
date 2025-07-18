package Principal;

import java.util.Scanner;
import model.Triangulo;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        double base;
        double altura;

        System.out.print("Digite a base do triângulo: ");
        base = scanner.nextDouble();
        triangulo.setBase(base);

        System.out.print("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();

        triangulo.setAltura(altura);

        System.out.printf("A área é: %.2f cm²", triangulo.getArea());

        scanner.close();
    }
}
