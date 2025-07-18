public class Principal {
    public static void main(String[] args){

        /* Getters and Setters ajudam a proteger dados do objeto
         e adicionam regras para acessar ou modificar os dados.
        GETTERS = Método que faz um campo legível
        SETTERS = Método que faz um campo capaz de escrever
         */

        Carro carro = new Carro("Cayenne", "Cinza", 1000000);

        carro.setCor("Azul");
        carro.setPreco(500000);


        System.out.println(carro.getModelo() + " " + carro.getCor() + " " + carro.getPreco());
    }
}
