package ex41;

public class ContaPoupanca extends Conta {

    private double juros;

    ContaPoupanca(){
        super();
        this.juros = 0;
    }
    ContaPoupanca(String nome, double saldo, double juros){
        super(nome, saldo);
        this.juros = juros;
    }

    @Override
    public double getSaldo(){
        return super.getSaldo() * (1 + this.juros);
    }

}
