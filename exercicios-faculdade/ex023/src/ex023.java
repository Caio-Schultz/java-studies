import java.util.Scanner;
public class ex023 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite um número inicial: ");
        num1 = scanner.nextInt();

        System.out.print("Digite um número final maior que o número inicial: ");
        num2 = scanner.nextInt();

        int i = num1;
        int soma = 0;

        while(i <= num2){
            soma = soma + i;
            i++;
        }

        System.out.println("A soma é: " + soma);


        scanner.close();
    }

}
