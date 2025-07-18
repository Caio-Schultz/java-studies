public class Principal {
    public static void main(String[] args){

        /*  Polimorfismo = "Poli" = vários
                           "morfismo" = forma
                           Objetos podem se identificar com outros objetos
                           Objetos podem ser tratados como objetos de uma superclasse em comum
         */

        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();
        Barco barco = new Barco();

        Veiculo veiculos[] = {carro, bicicleta, barco};

        for(int i = 0; i < veiculos.length; i++){
            veiculos[i].andar();
        }
    }
}
