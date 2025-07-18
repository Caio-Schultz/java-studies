public class Principal {
    public static void main(String[] args){

        /* Method Overriding = Quando uma subclass(filho) fornece
        sua própria implementação de um método que já está definido.
        Permite a reusabilidade do código e fornece uma implementação específica
       */

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Peixe peixe = new Peixe();

        cachorro.movimentar();
        gato.movimentar();
        peixe.movimentar();
    }
}
