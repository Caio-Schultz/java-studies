package nivelIntermediario;

public enum RankDeMissoes {

    // é possível criar parâmetros para cada elemento, a partir da criação de atributos dentro do enum e de construtores
    D("Baixo", 2),
    C("Moderado", 3),
    B("Comfortável", 4),
    A("Difícil", 5),
    S("Altissímo", 10);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
