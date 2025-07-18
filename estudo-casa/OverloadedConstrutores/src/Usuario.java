public class Usuario {

    String username;
    String email;
    int idade;



    Usuario(){
        this.username = "Guest";
        this.email = "Not provided";
        this.idade = 0;
    }
    Usuario(String username){
        this.username = username;
        this.email = "Not provided";
        this.idade = 0;
    }
    Usuario(String username, String email){
        this.username = username;
        this.email = email;
        this.idade = 0;
    }
    Usuario(String username, String email, int idade){
        this.username = username;
        this.email = email;
        this.idade = idade;
    }
}
