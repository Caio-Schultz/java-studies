package veiculo;

public class CarroPasseio extends Veiculo{

    String cor;
    String modelo;

    public CarroPasseio(){
        super();
        this.cor = "";
        this.modelo = "";
    }
    public CarroPasseio(int quilos, int velocidadeMaxima, double preco, String cor, String modelo){
        super(quilos, velocidadeMaxima, preco);
        this.cor = cor;
        this.modelo = modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public void solicitarDados(int quilos, int velocidadeMaxima, double preco, String cor, String modelo){
        this.quilos = quilos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.cor = cor;
        this.modelo = modelo;
    }

    @Override
    public String imprimirDados(){
        return super.imprimirDados() + ", cor: " + this.cor + ", modelo: " + this.modelo;
    }

}
