package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
            Enums (Enumerations) = Um tipo especial de classe que
                                   representa um conjunto fixo de constantes.
                                   Elas melhoram a legibilidade do código e são fáceis de manter
                                   Mais eficientes com switches do que comparar Strings

         */



        // Dia dia = Dia.SUNDAY;

        // System.out.println(dia);

        //System.out.println(dia.getDayNumber());




        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Digite qual o dia da semana: ");
            String resposta = scanner.nextLine().toUpperCase();

            Dia dia = Dia.valueOf(resposta);

            switch(dia){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("É um dia da semana!");  // enums são bem úteis para usar em switches
                case SATURDAY,
                     SUNDAY -> System.out.println("É final de semana!");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Por favor digite um dia válido");
        }


    }
}
