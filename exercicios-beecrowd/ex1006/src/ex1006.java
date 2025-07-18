import java.util.Scanner;

public class ex1006 {
    public static void main(String[] args){
        /*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
         A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2,
         a nota B tem peso 3 e a nota C tem peso 5.
         Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
         */

        Scanner scanner = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double somaComPeso;
        double media;

        System.out.print("Digite sua primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        nota3 = scanner.nextDouble();

        somaComPeso = (nota1*2) + (nota2*3) + (nota3*5);
        media = somaComPeso/10;

        System.out.printf("MÉDIA = %.1f", media);




        scanner.close();
    }
}
