public class Amigo {

    static int numeroDeAmigos;   // a palavra 'static' na frente desse atributo faz com que ele seja compartilhado por todos os métodos, logo é possível contar a quantidade de amigos
    String nome;

    Amigo(String nome){
        this.nome = nome;
        numeroDeAmigos++;
    }
    static void mostrarAmigos(){
        System.out.println("Você tem " + numeroDeAmigos + " amigos!");
    }
}
