import java.util.Scanner;
public class CalculadoraJurosCompostos {
    public static void main(String[] args){

        // Calculadora de juros compostos
        // Fórmula dos juros compostos
        // M = C x (1+i)^t
        // M = montante acumulado
        // C = capital inicialmente aplicado
        // i = taxa de juros

        Scanner scanner = new Scanner(System.in);
        double capitalInicialmenteAplicado;
        double montanteAcumulado;
        double taxaDeJuros;
        int tempoAplicado;

        System.out.print("Digite o valor que você pretende aplicar inicialmente: ");
        capitalInicialmenteAplicado = scanner.nextDouble();

        System.out.print("Digite a taxa de juros por mês que você pretende receber (em %): ");
        taxaDeJuros = scanner.nextDouble();

        taxaDeJuros = taxaDeJuros/100;

        System.out.print("Digite o tempo em meses que você pretende manter seu dinheiro investido: ");
        tempoAplicado = scanner.nextInt();


        montanteAcumulado = capitalInicialmenteAplicado * Math.pow(1 + taxaDeJuros, tempoAplicado);

        taxaDeJuros = taxaDeJuros*100;

        System.out.printf("O valor de R$%.2f investido durante %d meses se tornará R$%.2f com uma taxa de juros de %.1f%% ao mês", capitalInicialmenteAplicado, tempoAplicado, montanteAcumulado, taxaDeJuros);

        scanner.close();
    }
}
