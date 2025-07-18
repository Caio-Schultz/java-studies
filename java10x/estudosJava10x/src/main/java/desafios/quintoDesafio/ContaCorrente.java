package desafios.quintoDesafio;

public class ContaCorrente extends ContaBancaria{

    TipoConta tipoConta;

    public ContaCorrente(){
        super();
    }

    public ContaCorrente(double saldo){
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipoConta){
        super(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public double depositar(double valor){
       return this.saldo = this.saldo + valor;
    }

}
