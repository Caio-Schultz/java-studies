package desafios.quintoDesafio;

public abstract class ContaBancaria implements Conta{

    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo(){
        return this.saldo;
    }

    public abstract double depositar(double valor);
}
