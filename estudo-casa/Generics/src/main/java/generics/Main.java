package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        /*  Generics = Um conceito em que você pode escrever uma classe, interface ou método
                       que é compatível com diferentes tipos de dados
                       <T> type parameter (espaço reservado que é substituído por um tipo real)
                       <String> type argument (especifica o tipo)

         */

        Caixa<Integer> caixa = new Caixa<>();


        caixa.setItem(2);

        System.out.println(caixa.getItem());


        Produto<String, Double> produto1 = new Produto<>("Maçã", 0.50);
        Produto<String, Integer> produto2 = new Produto<>("Ticket", 15);

        System.out.println(produto1.getItem());
        System.out.println(produto1.getPrice());

        System.out.println(produto2.getItem());
        System.out.println(produto2.getPrice());
    }
}
