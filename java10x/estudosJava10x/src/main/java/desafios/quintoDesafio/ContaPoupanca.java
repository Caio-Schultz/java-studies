package desafios.quintoDesafio;

public class ContaPoupanca extends ContaBancaria{

    TipoConta tipoConta;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta){
        super(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public double depositar(double valor){
        return this.saldo = this.saldo + (valor * 0.99);
    }

}
