import java.util.Scanner;

public class ex1014 {
    public static void main(String[] args){
        /*Calcule o consumo médio de um automóvel sendo fornecidos
         a distância total percorrida (em Km) e o total de combustível gasto (em litros).
         */

        Scanner scanner = new Scanner(System.in);
        int distanciaTotal;
        double combustivelGasto;
        double consumoMedio;

        System.out.print("Digite a distância total percorrida: ");
        distanciaTotal = scanner.nextInt();

        System.out.print("Digite o total de combustível gasto no trajeto (em L): ");
        combustivelGasto = scanner.nextDouble();

        consumoMedio = distanciaTotal/combustivelGasto;

        System.out.printf("%.3f km/l", consumoMedio);



    }
}
