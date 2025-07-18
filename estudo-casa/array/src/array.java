import java.util.Arrays;

public class array {
    public static void main(String[] args){

        /* array = uma coleção de valores do mesmo tipo
        é como se fosse uma variável que armazena mais de um valor
         */

        String[] frutas = {"Maçã", "Banana", "Laranja"};

        frutas[2] = "Abacaxi";

        int numeroDeFrutas = frutas.length; // mostra quantos elementos tem em um array

        for(int i = 0; i < frutas.length; i++){
            Arrays.sort(frutas);   // esse método de array coloca os elementos em ordem alfabética em caso de Strings e em ordem crescente em caso de números
            System.out.println(frutas[i]);
        }


        System.out.println(numeroDeFrutas);

        // Métodos úteis para Arrays
        // Arrays.sort(frutas);  esse método de array coloca os elementos em ordem alfabética em caso de Strings e em ordem crescente em caso de números
        // Arrays.fill(frutas, "Ameixa"); esse método substitui todos os elementos pelo elemento indicado entre parênteses
        

    }
}
