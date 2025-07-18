import java.util.Scanner;
public class PrecoCinema {
    public static void main(String[] args){

        /* é possível colocar if dentro de if
        e if dentro de else
        No caso do if + if, as duas condições
        devem ser verdadeiras para resultar no
        que está escrito
        No caso do if dentro de um else, seria
        uma forma de colocar uma condição no else 
         */

        Scanner scanner = new Scanner(System.in);


        boolean estudante;
        boolean idoso;
        double precoIngresso = 10;

        System.out.print("Você é estudante?: (true/false) ");
        estudante = scanner.nextBoolean();

        System.out.print("Você é idoso?: (true/false) ");
        idoso = scanner.nextBoolean();

       if(estudante){
           if (idoso){
               System.out.println("Você tem 30% de desconto!");
               precoIngresso = precoIngresso*0.7;
           }
           else{
               System.out.println("Você tem 10% de desconto!");
               precoIngresso = precoIngresso*0.9;
           }

       }
       else{
          if(idoso){
              System.out.println("Você tem 20% de desconto");
              precoIngresso = precoIngresso*0.8;
          }else {
              precoIngresso = precoIngresso*1;
          }
       }
        System.out.printf("O valor do ingresso é R$%.2f", precoIngresso);
    }
}
