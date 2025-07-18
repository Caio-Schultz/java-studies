import java.util.Scanner;
public class ex019 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String frase;
        int numeroDeRepDaFrase;

        System.out.print("Digite uma frase: ");
        frase = scanner.nextLine();
        System.out.print("Digite quantas vezes você quer que essa frase se repita: ");
        numeroDeRepDaFrase = scanner.nextInt();

        for(int i = 0; i < numeroDeRepDaFrase; i++){
            System.out.println(frase);
        }

        scanner.close();
    }
}
