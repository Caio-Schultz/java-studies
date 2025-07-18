package desafios.quartoDesafio;

public enum TipoHabilidade {

    TAIJUTSU("Taijutsu"),
    NINJUTSU("Ninjutsu"),
    GENJUTSU("Genjutsu"),
    KATON("Katon"),
    RINNENGAN("Rinnengan");

    private String nomeTipoHabilidade;

    TipoHabilidade() {
    }

    TipoHabilidade(String nomeTipoHabilidade) {
        this.nomeTipoHabilidade = nomeTipoHabilidade;
    }

    public String getNomeTipoHabilidade() {
        return nomeTipoHabilidade;
    }

    public void setNomeTipoHabilidade(String nomeTipoHabilidade) {
        this.nomeTipoHabilidade = nomeTipoHabilidade;
    }
}
