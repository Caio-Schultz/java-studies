package veiculo;

public class Veiculo {

    int quilos;
    int velocidadeMaxima;
    double preco;

    public Veiculo(){
        this.quilos = 0;
        this.velocidadeMaxima = 0;
        this.preco = 0;
    }
    public Veiculo(int quilos, int velocidadeMaxima, double preco){
        this.quilos = quilos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    public int getQuilos(){
        return this.quilos;
    }
    public void setQuilos(int quilos){
        this.quilos = quilos;
    }
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public void setVelocidadeMaxima(){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void solicitarDados(int quilos, int velocidadeMaxima, double preco){
        this.quilos = quilos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }
    public String imprimirDados(){
        return "Dados: quilos: " + this.quilos + ", velocidade máxima (em km/h): " + this.velocidadeMaxima + ", preço: (em R$)" + this.preco;
    }
}
