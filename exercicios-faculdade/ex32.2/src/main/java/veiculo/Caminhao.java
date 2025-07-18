package veiculo;

public class Caminhao extends Veiculo{

    private int toneladas;
    private double alturaMaxima;
    private double comprimento;

    public Caminhao(){
        super();
        this.toneladas = 0;
        this.alturaMaxima = 0;
        this.comprimento = 0;
    }
    public Caminhao(int quilos, int velocidadeMaxima, double preco, int toneladas, double alturaMaxima, double comprimento){
        super(quilos, velocidadeMaxima, preco);
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public int getToneladas(){
        return this.toneladas;
    }
    public void setToneladas(int toneladas){
        this.toneladas = toneladas;
    }
    public double getAlturaMaxima(){
        return this.alturaMaxima;
    }
    public void setAlturaMaxima(double alturaMaxima){
        this.alturaMaxima = alturaMaxima;
    }
    public double getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public void solicitarDados(int quilos, int velocidadeMaxima, double preco, int toneladas, double alturaMaxima, double comprimento){
        this.quilos = quilos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.toneladas = toneladas;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }
    @Override
    public String imprimirDados(){
        return super.imprimirDados() + ", carga máxima: (em toneladas) " + this.toneladas + ", altura máxima: (em metros) " + this.alturaMaxima + ", comprimento: (metros) " + this.comprimento;
    }
}
