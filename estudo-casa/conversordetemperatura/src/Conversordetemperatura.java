import java.util.Scanner;

public class Conversordetemperatura {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double novaTemperatura;
        String caractere;

        System.out.print("Digite a temperatura: ");
        temperatura = scanner.nextDouble();

        System.out.print("Converter para Celsius ou Fahrenheit?: (C/F) ");
        caractere = scanner.next().toUpperCase();  // toUpperCase() vai fazer qualquer caractere ficar em letras maiúsculas, não tendo problemas de entrada com letras minúsculas


        novaTemperatura = (caractere.equals("C")) ? (temperatura- 32) * 5/9 : (temperatura* 9/5) + 32;

        System.out.printf("%.1f %s", novaTemperatura, caractere);


        scanner.close();
    }
}
