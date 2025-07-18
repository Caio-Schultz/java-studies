public class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;

    Carro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString(){
        return this.marca + " " + this.modelo + " " + this.cor + " " + this.ano;
    }
}
