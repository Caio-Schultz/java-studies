import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        /*  Runtime(dynamic) polimorfismo = Quando o método que é executado
                                   é decidido no tempo da execução
                                   com base no tipo do objeto.
         */


        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Você quer um cachorro ou um gato? (1 = cachorro, 2 = gato): ");
        int escolha = scanner.nextInt();

        if(escolha == 1){
            animal = new Cachorro();
            animal.falar();
        }
        else if(escolha == 2){
           animal = new Gato();
           animal.falar();
        }



    }
}
