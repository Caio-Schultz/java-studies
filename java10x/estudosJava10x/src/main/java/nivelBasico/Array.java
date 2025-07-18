package nivelBasico;

public class Array {
    public static void main(String[] args) {

        /*
        Arrays são do tipo referência
        Arrays tem um tamanho fixo
        Eles ocupam um espaço na mémoria
        Cada index vai "ocupar" uma parte do espaço da mémoria
        do array
         */
        String[] ninja = new String[5];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[4]);

        // FOR para fazer um loop, percorrer o array e mostrar todos os indexes do array

        for(int i = 0; i < ninja.length; i++){
            System.out.println(ninja[i]);
        }

        /*
        É possível redeclarar arrays
        O array antes declarado vai deixar de existir por conta do Garbage Collection (tópico mais avançado, deve ser pesquisado)
        e o array redeclarado vai começar a usar o mesmo
        espaço da memória que o outro usava
         */
        // Redeclarar array
        ninja = new String[6];
        System.out.println(ninja[0]);

        // Quando usamos a palavra reservada 'new' quer dizer que estamos criando um novo Objeto de mémoria
        int[] idade = new int[2];

        idade[0] = 16;

        System.out.println(idade[0]);

    }
}
