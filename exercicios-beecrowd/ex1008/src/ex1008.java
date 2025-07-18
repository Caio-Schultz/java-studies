import java.util.Scanner;

public class ex1008 {
    public static void main(String[] args){
        /*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
         o valor que recebe por hora e calcula o salário desse funcionário.
         A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
         */

        Scanner scanner = new Scanner(System.in);
        int idFuncionario;
        int numeroHorasTrabalhadas;
        double valorPorHora;
        double salario;

        System.out.print("Digite o seu id: ");
        idFuncionario = scanner.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        numeroHorasTrabalhadas = scanner.nextInt();
        System.out.print("Digite o valor que você recebe por hora: ");
        valorPorHora = scanner.nextDouble();

        salario = numeroHorasTrabalhadas*valorPorHora;

        System.out.println("ID = " + idFuncionario);
        System.out.printf("Salário = R$%.2f", salario);


        scanner.close();
    }
}
