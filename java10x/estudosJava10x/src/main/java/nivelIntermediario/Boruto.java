package nivelIntermediario;

public class Boruto extends Uzumaki implements HyugaUzumaki{

    @Override
    public void ativarKarma(){
        System.out.println("Meu nome é " + getNome() + "! Ativei o Karma, eu sou um Hyuga Uzumaki!");
    }

    @Override
    public void ativarJougan(){
        System.out.println("Meu nome é " + getNome() + "! Ativei o Jougan, eu sou um Hyuga Uzumaki!");
    }
}
