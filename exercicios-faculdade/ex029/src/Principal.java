import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();


        System.out.print("Digite os kilometros rodados: ");
        veiculo.setKilometrosRodados(scanner.nextDouble());

        System.out.print("Digite os litros gastos: ");
        veiculo.setLitros(scanner.nextDouble());

        System.out.printf("O consumo total é: %.2f km/l",veiculo.getConsumo());



        scanner.close();
    }
}
