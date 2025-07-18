public class Pessoa {

    String nome;
    String sobrenome;

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    void mostrarNome(){
        System.out.println(this.nome + " " + this.sobrenome);
    }
}
