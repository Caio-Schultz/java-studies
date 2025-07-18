package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        /*  ArrayList = Um array redimensionável que armazena objetos (autoboxing)
            Arrays têm tamanhos fixos, mas ArrayLists podem mudar de tamanho.
         */

        ArrayList<Double> list = new ArrayList<>();  // chama o objeto 'ArrayList' e coloca entre <> o tipo de objeto que você quer armazenar
        ArrayList<String> fruits = new ArrayList<>(); // é necessário importar a classe ArrayList para usá-la

        list.add(3.14);
        list.add(1.99);
        list.add(2.01);

        fruits.add("Maçã");  // para add um elemento ao ArrayList basta usar o método 'add'
        fruits.add("Laranja");
        fruits.add("Melão");
        fruits.add("Melancia");

        fruits.remove(0);   // para remover um elemento do ArrayList basta usar o método 'remove' e especificar a posição que deseja remover. No caso, o comportamento será remover o elemento "Maçã"

        fruits.set(1, "Abacaxi");  // para substituir um elemento do ArrayList basta usar o método 'set', especificar a posição que deseja substituir e escrever o novo elemento


        System.out.println(fruits.get(0));  // usando o método 'get' é possível especificar a posição que você deseja imprimir
        System.out.println(fruits.size());  // usando o método 'size' é possível saber o tamanho exato do ArrayList

        Collections.sort(fruits);  // esse método coloca os elementos do ArrayList em ordem alfabética (é necessário importar a classe 'Collections')

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }


    }
}
