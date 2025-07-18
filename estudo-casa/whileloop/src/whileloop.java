import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){

        // while loop = repete algum código para sempre ENQUANTO uma condição se mantém verdadeira


        Scanner scanner = new Scanner(System.in);

        String nome = "";

        while(nome.isEmpty()){
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
        }

        System.out.println("Olá " + nome);


        String sair = " ";

        while(!sair.equals("S")){          // usa-se o operador lógico NÃO(!) para fazer um loop ENQUANTO o usuário não pressionar "S"
            System.out.println("Você está em um jogo!");
            System.out.print("Pressione S para sair: ");
            sair = scanner.nextLine().toUpperCase();       // é possível usar apenas .next() para entrada de apenas um caractere e toUpperCase() é para não haver conflito se o usuário escrever em letra minúscula
        }

        System.out.println("Você saiu do jogo!");



        int idade = 0;

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        while(idade < 0){
            System.out.println("Sua idade não pode ser negativa!");
            System.out.println("Digite uma idade válida: ");
            idade = scanner.nextInt();
        }

        System.out.println("Você tem " + idade + " anos de idade!");


        /* do/while loop = parecido com o while loop,
         mas o do/while loop sempre vai rodar o código inserido nele pelo menos uma vez. No while loop
         se a condição for falsa oq está dentro do while nem vai ser considerado.
         */

        int numero = 0;

        do{
            System.out.print("Digite um número entre 1-10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Você escolheu o número: " + numero);

        scanner.close();
    }
}
