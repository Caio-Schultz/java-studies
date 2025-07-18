public class Principal {
    public static void main(String[] args){



        Carro carros[] = {new Carro("Civic", "Preto"), new Carro("Sorento", "Branco"), new Carro("BMW X6", "Verde")};

        for(int i = 0; i < carros.length; i++){
            carros[i].dirigir();
        }

    }
}
