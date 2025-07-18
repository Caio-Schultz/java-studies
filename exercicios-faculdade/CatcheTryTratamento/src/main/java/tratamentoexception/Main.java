package tratamentoexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Digite um número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite outro número: ");
            int numero2 = scanner.nextInt();

            int resultado = 0;

            resultado = numero1 / numero2;

            System.out.println(resultado);
        }
        catch(ArithmeticException erro){
            System.out.println("Não é possível dividir por zero!");
        }



    }
}
