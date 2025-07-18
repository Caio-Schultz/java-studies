import java.util.Scanner;

public class ex1015 {
    public static void main(String[] args){
        /*Leia os quatro valores correspondentes aos eixos x e y
         de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
         e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:
         */

        Scanner scanner = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double diferencaX1X2;
        double diferencaY1Y2;
        double distanciaDeUmPontoAoOutro;

        System.out.print("Digite os valores p1(x1, y1): ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.print("Digite os valores p2(x2, y2): ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        diferencaX1X2 = x2 - x1;
        diferencaY1Y2 = y2 - y1;

        distanciaDeUmPontoAoOutro = Math.sqrt(Math.pow(diferencaX1X2, 2) + (Math.pow(diferencaY1Y2, 2)));

        System.out.printf("%.4f", distanciaDeUmPontoAoOutro);





        scanner.close();
    }
}
