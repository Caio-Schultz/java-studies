package ex41;

public class ContaCorrente extends Conta{

    private double taxaServico;

    ContaCorrente(){
        super();
        this.taxaServico = 0;
    }
    ContaCorrente(String nome, double saldo, double taxaServico){
        super(nome, saldo);
        this.taxaServico = taxaServico;
    }

    @Override
    public double getSaldo(){
        return super.getSaldo() - this.taxaServico;
    }
}
