public class Principal {
    public static void main(String[] args){

        /* static = é uma 'key word' que faz com que uma variável ou um método
        pertença a uma classe inteira e não a um objeto específico.
        é comum ser usado para métodos utilitários ou recursos compartilhados
         */

        Amigo amigo1 = new Amigo("João");
        Amigo amigo2 = new Amigo("Maria");
        Amigo amigo3 = new Amigo("José");
        Amigo amigo4 = new Amigo("Samuel");
        Amigo amigo5 = new Amigo("Ana");


        System.out.println(amigo1.nome);
        System.out.println(amigo2.nome);
        System.out.println(amigo3.nome);
        System.out.println(amigo4.nome);
        System.out.println(amigo5.nome);
        System.out.println(Amigo.numeroDeAmigos);// como numeroDeAmigos é static, é possível inicializar com o nome da classe. No caso, Amigo.numeroDeAmigos

        Amigo.mostrarAmigos();
    }
}
