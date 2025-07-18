import java.util.Scanner;

public class ProgramaUsandoArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numeroDeComidas;


        System.out.print("Digite o número de comidas diferentes você deseja: ");
        numeroDeComidas = scanner.nextInt();

        scanner.nextLine(); // essa linha é para limpar o buffer e não dar um bug dps


        String comidas[] = new String[numeroDeComidas];

        for(int i = 0; i < numeroDeComidas; i++){
            System.out.print("Digite a comida: ");
            comidas[i] = scanner.nextLine();
        }

        for(int i = 0; i < numeroDeComidas; i++) {
            System.out.println(comidas[i]);
        }

        scanner.close();
    }
}
