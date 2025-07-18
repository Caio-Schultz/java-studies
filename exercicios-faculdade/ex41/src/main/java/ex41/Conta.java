package ex41;

public abstract class Conta {

    String nome;
    double saldo;

    Conta(){
       this.nome = "";
       this.saldo = 0;
    }
    Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;

    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setDeposito(double deposito){
        this.saldo = this.saldo + deposito;
    }
}
