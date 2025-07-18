import java.util.Scanner;

public class Switchmethod {
    public static void main(String[] args){

        // método do switch substitui vário else if


        // exemplo com vários else if

        /*
        String dia = "Sexta-feira";

        if(dia.equals("Segunda-feira")){
            System.out.println("É um dia da semana!");
        }
        else if(dia.equals("Terça-feira")){
            System.out.println("É um dia da semana");
        }
        else if(dia.equals("Quarta-feira")){
            System.out.println("É um dia da semana");
        }
        else if(dia.equals("Quinta-feira")){
            System.out.println("É um dia da semana");
        }
        else if(dia.equals("Sexta-feira")){
            System.out.println("É um dia da semana");
        }
        else if(dia.equals("Sábado")){
            System.out.println("É um dia do final de semana");
        }
        else if(dia.equals("Domingo")){
            System.out.println("É um dia do final de semana");
        }
        else{
           System.out.println("Não é um dia");
        }

         */

        // método switch

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = scanner.nextLine();

        switch(dia){
            case "Segunda-feira" -> System.out.println("É um dia da semana");
            case "Terça-feira" -> System.out.println("É um dia da semana");
            case "Quarta-feira" -> System.out.println("É um dia da semana");
            case "Quinta-feira" -> System.out.println("É um dia da semana");
            case "Sexta-feira" -> System.out.println("É um dia da semana");
            case "Sábado" -> System.out.println("É final de semana");
            case "Domingo" -> System.out.println("É final de semana");
            default -> System.out.println(dia + " não é um dia");
        }


    }
}
