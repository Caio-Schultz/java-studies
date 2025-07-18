import java.util.Scanner;
public class Testedescanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        System.out.print("Você é um estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();


        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua nota é " + nota);

        if(estudante){
            System.out.println("Você é um estudante!");
        }else{
            System.out.println("Você não é um estudante!");
        }

        scanner.close();
    }
}
