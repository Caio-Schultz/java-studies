package desafios.quintoDesafio;

public enum TipoConta {

    CORRENTE("Conta Corrente"),
    POUPANCA("Conta Poupança");

    private String tipoConta;

    TipoConta() {
    }

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
