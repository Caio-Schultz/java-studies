package nivelIntermediario;

public class Hyuga extends Ninja{

    public Hyuga(){
        super();
    }

    public Hyuga(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public Hyuga(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void ativarByakugan(){
        System.out.println("Meu nome é " + getNome() + "! Eu ativei o Byakugan, sou um Hyuga!");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Hyuga, um ataque de visão");
    }
}
