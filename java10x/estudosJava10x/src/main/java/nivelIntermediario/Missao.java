package nivelIntermediario;

public class Missao {

    private String nome;
    private RankDeMissoes rank;

    // metodo para mostrar mais informacoes
    public void exibirDetalhes(){
        System.out.println("Missão: " + this.nome + ", Rank: " + rank + " (Descrição: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade() + ")");
    }

    public Missao() {
    }

    public Missao(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
