public class Carro {
    String modelo;
    String cor;

    Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }
    void dirigir(){
        System.out.println("Você dirige o " + this.modelo + " " + this.cor);
    }
}
