public class Livraria {

    String nome;
    int ano;
    Livro livros[];

    Livraria(String nome, int ano, Livro livros[]){
            this.nome = nome;
            this.ano = ano;
            this.livros = livros;
    }

    void mostrarInfo(){
        System.out.println("A " + this.nome + " de " + this.ano);
        System.out.println("Livros disponíveis: ");
        for(int i = 0; i < livros.length; i++){
            System.out.println(livros[i].mostrarInfo());
        }
    }
}
