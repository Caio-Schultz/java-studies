import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double base;
        double altura;
        double area;


        System.out.print("Digite a base do triângulo em cm: ");
        base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo em cm: ");
        altura = scanner.nextDouble();

        area = (base * altura) /2;

        System.out.printf("A área é: %.2f cm²", area);

        scanner.close();
    }
}
