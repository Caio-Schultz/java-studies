import java.util.Scanner;

public class ex1005 {
    public static void main(String[] args){
        /*Leia 2 valores de ponto flutuante de dupla precisão A e B,
         que correspondem a 2 notas de um aluno.
         A seguir, calcule a média do aluno,
         sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
         (A soma dos pesos portanto é 11).
         Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
         */

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double somaComPeso;
        double media;

        System.out.print("Digite a sua primeira nota: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        num2 = scanner.nextDouble();

        somaComPeso = (num1*3.5) + (num2*7.5);
        media = somaComPeso/11;

        System.out.printf("MÉDIA = %.5f", media);


        scanner.close();
    }
}
