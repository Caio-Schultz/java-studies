public class Variáveis {
    public static void main(String[] args){

        int idade = 19; // int - número inteiro com 32 bits de representação
        int ano = 2025;
        int quantidade = 1;

        System.out.println("O ano atual é: " + ano);

        double preco = 19999.99; // double - número decimal com precisão dupla
        double nota = 9.5;

        System.out.println("O preço é $" + preco);

        char turma = 'A';    // char - apenas um caractere
        char simbolo = '!';
        char moeda = '$';

        System.out.println("o símbolo do dólar é: " + moeda);

        boolean estudante = true;
        boolean compraAceita = false;
        boolean alguemOnline = true;

        System.out.println(compraAceita);

        String nome = "Caio";
        String comida = "sushi";
        String email = "caio.mazziero.schultz@gmail.com";
        String carro = "Honda Civic";
        String cor = "Preto";

        System.out.println("Oi " + nome);
        System.out.println("Sua comida favorita é " + comida);
        System.out.println("Seu email é " + email);
        System.out.println("Você tem " + idade + " anos de idade!");
        System.out.println("Sua nota é: " + nota);
        System.out.println("Sua turma é o nono ano " + turma);
        System.out.println("Sua escolha é um " + carro + " " + cor + " " + ano);
        System.out.println("O preço é " + moeda + preco);

        if(compraAceita){
            System.out.println("Parabéns, você comprou um " + carro + " " + cor + " " + ano + "!");
        }else {
            System.out.println("A compra do seu " + carro + " " + cor + " " + ano + " foi recusada!");
        }
    }
}
