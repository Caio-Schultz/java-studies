package desafios.quartoDesafio;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(){

    }

    public NinjaBasico(String nome, int idade, String habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade){
        this(nome, idade, habilidade);
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Tipo da habilidade: " + tipoHabilidade.getNomeTipoHabilidade());
    }

    @Override
    public void executarHabilidade(){
        System.out.println(this.habilidade + " Ativado!");
    }
}
