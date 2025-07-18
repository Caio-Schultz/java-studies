package nivelBasico;

public class IfEElse {
    public static void main(String[] args) {

        /*
        If e Else - Condições
        else if
        Objetivo: Passar o ninja de nível de acordo
        com o número de missões
         */

        String nome = "Naruto Uzumaki";
        String ranking;
        int idade = 16;
        boolean hokage = false;
        int numeroDeMissoes = 101;


        if(numeroDeMissoes >= 20 && numeroDeMissoes < 100 && idade > 15){
            hokage = false;
            ranking = "chunin";
            System.out.println(nome + " é um " + ranking + "!");
        }
        else if(numeroDeMissoes >= 100 && idade > 15){
            hokage = true;
            ranking = "hokage";
            System.out.println(nome + " é um " + ranking + "!");
        }
        else {
            hokage = false;
            ranking = "genin";
            System.out.println(nome + " ainda é um " + ranking + "!");
        }






    }
}
