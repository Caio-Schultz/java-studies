public class Principal {
    public static void main(String[] args){

        /*
            .toString() = Método de herança da classe do objeto
                        usado para retornar uma representação do objeto em forma de string.
                        Como padrão, retorna um hash code como um identificador único.
                        pode ser overridden para fornecer detalhes significativos.
         */

        Carro carro1 = new Carro("Honda", "Civic", 2025, "Preto");
        Carro carro2 = new Carro("Toyota", "Corolla", 2024, "Cinza");

        System.out.println(carro1);
        System.out.println(carro2);


    }
}
