public class Principal {
    public static void main(String[] args){

        /* overloaded construtores = permite que uma classe tenha vários
        métodos construtores com parâmetros diferentes.
         permite que objetos possam ser inicializado de várias maneiras diferentes
         é útil em situações que alguns atributos são opcionais para o objeto
        */

        Usuario usuario1 = new Usuario("caio_schultz");
        Usuario usuario2 = new Usuario("alendagiratoria", "alendagiratoria@gmail.com");
        Usuario usuario3 = new Usuario("schultzz", "caio.mazziero.schultz@gmail.com", 19);
        Usuario usuario4 = new Usuario();

        System.out.println(usuario1.username);
        System.out.println(usuario1.email);
        System.out.println(usuario1.idade);
        System.out.println(usuario2.username);
        System.out.println(usuario2.email);
        System.out.println(usuario2.idade);
        System.out.println(usuario3.username);
        System.out.println(usuario3.email);
        System.out.println(usuario3.idade);
        System.out.println(usuario4.username);
        System.out.println(usuario4.email);
        System.out.println(usuario4.idade);
    }
}
