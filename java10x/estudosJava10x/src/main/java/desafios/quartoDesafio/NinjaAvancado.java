package desafios.quartoDesafio;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvancado(){

    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade){
        this(nome, idade, habilidade, especialidade);
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Tipo de habilidade: " + tipoHabilidade.getNomeTipoHabilidade());
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void executarHabilidade(){
        System.out.println(this.habilidade + " Ativado!");
        System.out.println(this.especialidade + " Ativado!");
    }

}
