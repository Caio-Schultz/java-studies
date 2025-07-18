public class Livro {

    String titulo;
    int paginas;

    Livro(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }

    String mostrarInfo(){
        return "O título desse livro é " + this.titulo + " e ele contém " + this.paginas + " páginas";
    }
}
