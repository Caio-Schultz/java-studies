package desafios.quartoDesafio;

public class Main {
    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 18, "Rasengan");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 22, "Sharingan", "Ninjutsu");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
    }
}
