package nivelIntermediario;

public abstract class Hokage {

    String nome;
    int idade;
    boolean vivo;

    /*
    Geralmente só é feito NoArgsConstructor e AllArgsConstructor
    No entanto, também é possível criar construtores com argumentos
    específico, basta cada construtor ter sua própria "assinatura"
     */

    // NoArgsConstructor
    public Hokage(){
    }

    public Hokage(String nome){
        this.nome = nome;
    }

    public Hokage(int idade){
        this.idade = idade;
    }

    // AllArgsConstructor
    public Hokage(String nome, int idade, boolean vivo){
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

    // é possível criar métodos abstratos, eles não possuem corpo
    public abstract void sabedoriaHokage();

}
