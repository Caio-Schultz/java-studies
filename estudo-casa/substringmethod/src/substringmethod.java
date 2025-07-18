import java.util.Scanner;

public class substringmethod {
    public static void main(String[] args){

        /* .substring() = um método para extrair uma porção de uma string
           .substring(start, end)
         */

        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String dominio;

        // String email = "caio.mazziero.schultz@gmail.com";


        /* Essa maneira não é flexível
        String username = email.substring(0, 21);
        String dominio = email.substring(22, 31); ou simplesmente String dominio = email.substring(22); (considera todas as posições do 22 até o final
        */

        // Essa maneira é flexível

        System.out.print("Digite seu email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            dominio = email.substring(email.indexOf("@") + 1);
            System.out.println(email);
            System.out.println(username);
            System.out.println(dominio);
        }
        else{
            System.out.println("Seu email precisa conter @");
        }





        scanner.close();
    }
}
