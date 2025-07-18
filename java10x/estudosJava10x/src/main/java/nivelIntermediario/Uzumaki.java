package nivelIntermediario;

public class Uzumaki extends Ninja{

    private Biju bijus;

    public Uzumaki(){
        super();
    }

    public Uzumaki(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank, Biju bijus){
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
        this.bijus = bijus;
    }

    public Biju getBijus() {
        return bijus;
    }

    public void setBijus(Biju bijus) {
        this.bijus = bijus;
    }

    public void modoSabioAtivado(){
        System.out.println("Meu nome é " + getNome() + "! O modo sábio ativou, eu sou um Uzumaki!");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Uzumaki, um ataque de ar");
    }



}

