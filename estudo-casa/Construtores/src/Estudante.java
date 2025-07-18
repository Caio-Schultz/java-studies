public class Estudante {

    String nome;
    int idade;
    double nota;
    boolean estaMatriculado;

    Estudante(String nome, int idade, double nota){  // método construtor possui o mesmo nome da classe e quando um objeto é declarado no código principal esse método é inicializado
        this.nome = nome;   // this é usado para indicar o atributo. Nesse caso, o atributo nome vai receber o parâmetro nome (é comum declarar o atributo e o parâmetro com o mesmo nome)
        this.idade = idade; // é interessante imaginar que o this.idade = idade; é como se fosse estudante1.idade = idade;
        this.nota = nota;
        this.estaMatriculado = true;
    }
    void Estudar(){
        System.out.println(this.nome + " está estudando");
    }

}
