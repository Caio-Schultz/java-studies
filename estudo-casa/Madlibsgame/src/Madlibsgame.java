import java.util.Scanner;

public class Madlibsgame {
    public static void main(String[] args){

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjetivo1, substantivo1, adjetivo2, verbo1, adjetivo3;

        System.out.print("Escreva um adjetivo para definir o zoológico que você visitou: ");
        adjetivo1 = scanner.nextLine();

        System.out.print("Escreva um animal que você viu no zoológico: ");
        substantivo1 = scanner.nextLine();

        System.out.print("Escreva um adjetivo para definir o animal que você viu: ");
        adjetivo2 = scanner.nextLine();

        System.out.print("Escreva um verbo no gerúndio (terminando com -ndo) para definir uma ação que esse animal fazia quando você viu ele: ");
        verbo1 = scanner.nextLine();

        System.out.print("Escreva um adjetivo que define seu sentimento ao ver esse animal: ");
        adjetivo3 = scanner.nextLine();

        System.out.println("\nHoje eu fui para um zoológico " + adjetivo1 + ".");
        System.out.println("Eu vi um " + substantivo1 + ".");
        System.out.println(substantivo1 + " era muito " + adjetivo2 + " e ele estava " + verbo1 + "!");
        System.out.println("Eu estava " + adjetivo3 + "!");

        scanner.close();
    }
}
