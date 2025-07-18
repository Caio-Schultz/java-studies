import java.util.Scanner;

public class ValidacaoUsuario {
    public static void main(String[] args){

        // && = AND/E
        // || = OR/OU
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        // username tem que ter entre 4-12 caracteres
        // username não pode conter espaço ou underline

        String username;

        System.out.print("Digite seu username: ");
        username = scanner.nextLine();

        if(username.contains(" ") || username.contains("_")){
            System.out.println("Username não pode conter espaço ou underline");
        }
        else if(username.length() < 4 || username.length() > 12){
            System.out.println("Username deve ter entre 4-12 caracteres");
        }
        else {
            System.out.println("Seu username é: " + username);
        }


        scanner.close();

    }
}
