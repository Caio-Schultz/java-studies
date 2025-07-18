public class Principal {
    public static void main(String[] args){

        /*
        Composition = Representa uma relação "part-of" entre objetos
                      Por exemplo, um Motor é "parte" de um Carro
                      Permite objetos complexos serem construídos por objetos menores
         */

        Carro carro = new Carro("Civic", 2025, "V6");

        System.out.println(carro.modelo );
        System.out.println(carro.ano);
        System.out.println(carro.motor.tipoDeMotor);

        carro.ligar();
    }
}
