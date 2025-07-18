public class Principal {
    public static void main(String[] args){

        /* Aggregation = Representa uma relação "has-a" entre objetos
                         Um objeto contém outros objetos como parte da sua estrutura,
                         mas os objetos contidos podem existir de forma independente

         */


        Livro livro1 = new Livro("Revolução dos Bichos", 300);
        Livro livro2 = new Livro("1984", 600);
        Livro livro3 = new Livro("O hobbit", 345);

        Livro livros[] = {livro1, livro2, livro3};

        Livraria livraria = new Livraria("Livraria Cultural", 2019, livros);

        livraria.mostrarInfo();

    }
}
