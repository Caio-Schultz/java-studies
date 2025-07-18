import java.util.Scanner;

public class ExCircunferência {
    public static void main(String[] args){

    // circunferência = 2 * Math.PI * raio;
    // area = Math.PI * Math.pow(raio, 2);
    // volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3)

    Scanner scanner = new Scanner(System.in);
    double raio, circunferencia, area, volume;

        System.out.print("Digite o raio da circunferência: ");
        raio = scanner.nextDouble();

        circunferencia = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);


        System.out.println("O  tamanho da circunferência é " + circunferencia + " cm");
        System.out.println("O área é " + area + " cm²");
        System.out.println("O volume é " + volume + " cm³");

        scanner.close();
    }

}
