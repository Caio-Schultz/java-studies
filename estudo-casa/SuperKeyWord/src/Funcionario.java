public class Funcionario extends Pessoa{

    double salario;

    Funcionario(String nome, String sobrenome, double salario){
        super(nome, sobrenome);
        this.salario = salario;
    }

    void mostrarSalario(){
        System.out.printf("O salário do funcionário %s %s é: R$%.2f", this.nome, this.sobrenome, this.salario);
    }
}
