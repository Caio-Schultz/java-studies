public class Funcionario extends Pessoa{

    double salario;
    String cargo;
    String dataContratacao;

    public Funcionario(){
        this.salario = 0;
        this.cargo = "";
        this.dataContratacao = "";
    }
    public Funcionario(int idPessoa, String nome, int idade, double salario, String cargo, String dataContratacao){
        super(idPessoa, nome, idade);
        this.salario = salario;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
    }

    double calcularImposto(){
        if(this.salario <= 1900){
            return this.salario * 1;
        }
        else if(this.salario > 1900 && this.salario <= 5000){
            return this.salario - (this.salario * 0.15);
        }
        else if (this.salario < 0){
            return 0;
        }
        else {
            return this.salario - (this.salario * 0.27);
        }
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.printf("R$ %.2f\n", salario);
        System.out.println(cargo);
        System.out.println(dataContratacao);
        System.out.printf("Salário após imposto: %.2f", calcularImposto());
    }
}
