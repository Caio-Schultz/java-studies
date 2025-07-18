import java.util.Scanner;

public class ExHipotenusa {
    public static void main(String[] args){

        // Hipotenusa c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o valor do lado a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor do lado b: ");
        b = scanner.nextDouble();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = a + b;
        c = Math.sqrt(c); // ou c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("A hipotenusa mede " + c + " cm");

        scanner.close();
    }
}
