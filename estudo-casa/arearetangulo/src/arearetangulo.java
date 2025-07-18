import java.util.Scanner;
public class arearetangulo {
    public static void main(String[] args){

        // área de um retângulo

        double altura = 0, largura = 0, area = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        largura = scanner.nextDouble();

        area = altura*largura;

        System.out.println("A área desse retângulo é " + area + " cm²");

        scanner.close();
    }
}
