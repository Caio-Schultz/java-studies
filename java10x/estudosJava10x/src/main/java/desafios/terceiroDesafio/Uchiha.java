package desafios.terceiroDesafio;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    @Override
    public String mostrarInformacoes(){
        return super.mostrarInformacoes() + ", Habilidade especial: " + this.habilidadeEspecial;
    }

    public String mostrarHabilidadeEspecial(){
        return "Habilidade especial: " + this.habilidadeEspecial;
    }
}
