package nivelIntermediario;

public class Haruno extends Ninja{

    public Haruno(){
        super();
    }

    public Haruno(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public Haruno(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void ativarCura(){
        System.out.println("Meu nome é " + getNome() + "! Ativei minha cura, eu sou um Haruno!");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Haruno");
    }
}
