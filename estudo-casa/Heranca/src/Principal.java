public class Principal {
    public static void main(String[] args){

        /* Inheritance (herança) = uma classe herda atributos e métodos
        de outra classe.
        Filho <- Pai <- Avô
         */

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Planta planta = new Planta();


        System.out.println(cachorro.estaVivo);
        cachorro.comer();
        System.out.println(cachorro.vidas);
        cachorro.falar();
        System.out.println(gato.estaVivo);
        gato.comer();
        System.out.println(gato.vidas);
        gato.falar();
        System.out.println(planta.estaVivo);
        planta.fotossintese();




    }
}
