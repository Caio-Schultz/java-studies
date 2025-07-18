public class Principal {
    public static void main(String[] args){

        /* objetos = uma entidade que mantém dados (atributos)
           e pode desempenhar ações (métodos)
           é um tipo de dado de referência
         */

        Carro carro = new Carro();// assim que declara um objeto, é parecido com o Scanner (até pq o próprio Scanner é um objeto)
        Carro carro2 = new Carro();

        System.out.println(carro.marca + " " + carro.modelo);
        System.out.println(carro2.marca + " " + carro2.modelo);


        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println(carro.preco);


        carro.ligar();
        System.out.println(carro.estaLigado);
        carro.desligar();
        System.out.println(carro.estaLigado);

        carro.dirigir();
        carro.freiar();

    }
}
