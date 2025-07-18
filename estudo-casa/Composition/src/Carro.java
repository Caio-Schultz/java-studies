public class Carro {

    String modelo;
    int ano;
    Motor motor;

    Carro(String modelo, int ano, String tipoDeMotor){
        this.modelo = modelo;
        this.ano = ano;
        this.motor = new Motor(tipoDeMotor);
    }

    void ligar(){
        this.motor.iniciar();
        System.out.println("O " + this.modelo + " está ligado!");
    }
}
