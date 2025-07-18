public class Motor {

    String tipoDeMotor;

    Motor(String tipoDeMotor){
        this.tipoDeMotor = tipoDeMotor;
    }

    void iniciar(){
        System.out.println("Você iniciou o motor " + this.tipoDeMotor);
    }
}
