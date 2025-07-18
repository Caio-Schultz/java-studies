package nivelIntermediario;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public Hatake(){
        super();
    }

    public Hatake(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public Hatake(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Hatake");
    }

    @Override
    public void sharinganAtivado(){
        System.out.println(getNome() + " ativou o Sharingan!");
    }

    @Override
    public void ninjaDeElite(){
        System.out.println("Você é um ninja de elite e faz parte da Anbu!");
    }
}
