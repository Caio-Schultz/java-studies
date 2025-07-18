package main;

import model.Pessoa;

public class main {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa(1, "Caio Schultz", "caio@gmail.com");
        Pessoa pessoa2 = new Pessoa(2, "Maria silva", "maria@gmail.com");
        Pessoa pessoa3 = new Pessoa(3, "João Souza", "joao@gmail.com");

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);


    }
}
