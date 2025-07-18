import java.util.Random;
import java.util.Scanner;

public class ProgramaDeDados {

    static int somaTotal = 0;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroDeDados;


        System.out.print("Digite o número de dados que você deseja lançar: ");
        numeroDeDados = scanner.nextInt();

        while(numeroDeDados <= 0){
            System.out.println("O número de dados lançados deve ser positivo!");
            System.out.print("Digite o número de dados que você deseja lançar: ");
            numeroDeDados = scanner.nextInt();
        }



        System.out.println("Lançando " + numeroDeDados + " dados...");

        for(int i = 0; i < numeroDeDados; i++) {
            int numeroAleatorio = random.nextInt(1, 7);

            switch (numeroAleatorio) {
                case 1 -> somaTotal = dado1(somaTotal);
                case 2 -> somaTotal = dado2(somaTotal);
                case 3 -> somaTotal = dado3(somaTotal);
                case 4 -> somaTotal = dado4(somaTotal);
                case 5 -> somaTotal= dado5(somaTotal);
                case 6 -> somaTotal = dado6(somaTotal);
            }
        }
        System.out.println("Soma total de todos os dados: " + somaTotal);






        scanner.close();
    }
    static int dado1(int somaTotal){

        System.out.println(" -------- ");
        System.out.println("|         |");
        System.out.println("|    @    |");
        System.out.println("|         |");
        System.out.println(" -------- ");
        System.out.println("Caiu no 1!");

        return somaTotal + 1;
    }
    static int dado2(int somaTotal){

        System.out.println(" -------- ");
        System.out.println("| @       |");
        System.out.println("|         |");
        System.out.println("|       @ |");
        System.out.println(" -------- ");
        System.out.println("Caiu no 2!");

        return somaTotal + 2;
    }
    static int dado3(int somaTotal) {

        System.out.println(" -------- ");
        System.out.println("| @       |");
        System.out.println("|    @    |");
        System.out.println("|       @ |");
        System.out.println(" -------- ");
        System.out.println("Caiu no 3!");

        return somaTotal + 3;
    }
        static int dado4 (int somaTotal) {

            System.out.println(" -------- ");
            System.out.println("| @     @ |");
            System.out.println("|         |");
            System.out.println("| @     @ |");
            System.out.println(" -------- ");
            System.out.println("Caiu no 4!");

            return somaTotal + 4;
        }
    static int dado5 (int somaTotal) {

        System.out.println(" -------- ");
        System.out.println("| @     @ |");
        System.out.println("|    @    |");
        System.out.println("| @     @ |");
        System.out.println(" -------- ");
        System.out.println("Caiu no 5!");

        return somaTotal + 5;
    }
    static int dado6 (int somaTotal) {

        System.out.println(" -------- ");
        System.out.println("| @     @ |");
        System.out.println("| @     @ |");
        System.out.println("| @     @ |");
        System.out.println(" -------- ");
        System.out.println("Caiu no 6!");

        return somaTotal + 6;
    }
}