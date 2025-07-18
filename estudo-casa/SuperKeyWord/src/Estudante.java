public class Estudante extends Pessoa{

    double nota;

    Estudante(String nome, String sobrenome, double nota){
        super(nome, sobrenome);  // usa-se super para essa classe filho poder inicializar atributos da classe pai. é interessante pensar que super(nome, sobrenome) é como se fosse Pessoa(nome, sobrenome), nesse caso.
        this.nota = nota;
    }

    void mostrarNota(){
        System.out.println("A nota do aluno " + this.nome + " " + this.sobrenome +  " é: " + this.nota);
    }
}
