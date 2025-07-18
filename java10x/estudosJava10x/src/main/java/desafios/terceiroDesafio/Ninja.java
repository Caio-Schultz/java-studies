package desafios.terceiroDesafio;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public String mostrarInformacoes(){
        return "Nome: " + this.nome + ", Idade: " + this.idade + ", Missão: " + this.missao + ", Nível de dificuldade: " + this.nivelDeDificuldade + ", Status da missão: " + this.statusDaMissao;
    }
}
