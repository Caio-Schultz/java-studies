public class SuperKeyWord {
    public static void main(String[] args){

        /* super = uma key word que se refere a uma classe Pai (subclass <- superclass)
        usado em construtores e métodos overriding
        chama o construtor pai para inicializar atributos
         */

        Pessoa pessoa = new Pessoa("Caio", "Schultz");
        Estudante estudante = new Estudante("João", "Cabral", 7.5);
        Funcionario funcionario = new Funcionario("Leonardo", "Silva", 10000.50);

        estudante.mostrarNome();
        estudante.mostrarNota();
        funcionario.mostrarNome();
        funcionario.mostrarSalario();

    }
}
