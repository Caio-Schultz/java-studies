import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args){

        // if = verifica se uma condição é verdadeira
        Scanner scanner = new Scanner(System.in);
        int idade;
        String nome;
        boolean estudante;


        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Você é estudante? (true/false): ");
        estudante = scanner.nextBoolean();

        //GRUPO 1
        if(nome.isEmpty()){        // variavel.isEmpty() verifica se o usuário não fez nenhuma entrada para a String
            System.out.println("Você não digitou seu nome.");
        }else{
            System.out.println("Oi, " + nome + "!");
        }



        //GRUPO 2
        if(idade >= 62){
            System.out.println("Você é um idoso!"); // a ordem importa! o programa verifica de cima para baixo, ou seja, a primeira condição estiver verdadeira ele não vai ver o resto. Logo é preciso colocar a condição de idoso antes da de adulto para não causar erro
        }
        else if(idade >= 18){
            System.out.println("Você é um adulto!");
        }
        else if(idade == 0){
            System.out.println("Você é um bebê!");
        }
        else if(idade < 0){
            System.out.println("Você ainda não nasceu!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }

        //GRUPO 3
        if(estudante){   // apenas escrever a variável booleana já indica que no "if" ela é verdadeira e no "else" ela é falsa
            System.out.println("Você é um estudante!");
        }else{
            System.out.println("Você NÃO é um estudante!");
        }

        scanner.close();
    }
}
