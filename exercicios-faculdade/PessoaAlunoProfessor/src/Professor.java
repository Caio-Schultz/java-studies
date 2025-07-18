public class Professor extends Pessoa{

    double salario;
    String titulo;

    Professor(){
        this.salario = 0;
        this.titulo = "";
    }
    Professor(int idPessoa, String nome, int idade, double salario, String titulo){
        super(idPessoa, nome, idade);
        this.salario = salario;
        this.titulo = titulo;
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
    void mostrarDados(){
        super.mostrarDados();
        System.out.printf("R$ %.2f\n", salario);
        System.out.println(titulo);
        System.out.printf("Salário após imposto: %.2f\n", calcularImposto());
    }
}
