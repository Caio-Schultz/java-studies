import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int escolha;
        int somaDosAcertos = 0;
        String perguntas[] = {"Quem é o maior artilheiro da Champions?",
                "Quem é o jogador com mais conquistas de copa do mundo?",
                "Quem é o jogador com mais títulos da NBA?",
                "Quem é o único brasileiro na f1 atualmente (2025)?",
                "Dos jogadores abaixo, qual o Caio mais gosta?"};

        String respostas[][] = {
                {"1. Lionel Messi", "2. Karim Benzema", "3. Robert Lewandowski", "4. Cristiano Ronaldo"},
                {"1. Pelé", "2. Lionel Messi", "3. Diego Maradona", "4. Kylian Mbappé"},
                {"1. Michael Jordan", "2. Lebron James", "3. Stephen Curry", "4. Bill Russell"},
                {"1. Felipe Massa", "2. Rubinho Barrichello", "3. Gabriel Bortoleto", "4. Neymar Jr"},
                {"1. Cristiano Ronaldo", "2. Arjen Robben", "3. Raphael Veiga", "4.Kevin De Bruyne"}};

        int gabaritoDasRespostas[] = {4, 1, 4, 3, 2};


        System.out.println("****************************");
        System.out.println("Bem-vindo ao Java Quiz Game");
        System.out.println("****************************");

        for(int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.println(respostas[i][j]);
            }
            do {
                System.out.print("Sua escolha: ");
                escolha = scanner.nextInt();
            } while (escolha < 1 || escolha > 4);
            if (escolha != gabaritoDasRespostas[i]) {
                System.out.println("*******");
                System.out.println("ERRADO!");
                System.out.println("*******");
            } else {
                System.out.println("*******");
                System.out.println("CERTO!");
                System.out.println("*******");
                somaDosAcertos++;
            }
        }

        System.out.println("********************************");
        System.out.println("Sua pontuação final foi: " + somaDosAcertos + " de " + perguntas.length);
        System.out.println("********************************");



        scanner.close();
    }
}
