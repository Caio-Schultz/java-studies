package nivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, int idade, String aldeia){
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Uchiha, um ataque de fogo");
    }

    @Override
    public void sharinganAtivado(){
        System.out.println(getNome() + " ativou o Sharingan!");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + getNome() + " e essa é minha inteligência de combate!");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if(qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        }
        else if(qi >= 130){
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        }
        else{
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }

}
