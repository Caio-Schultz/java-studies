import java.util.Random;

public class Randomnumber {
    public static void main(String[] args){

        Random random = new Random();

        int numero1;
        int numero2;
        double numero3;
        boolean cara;

        numero1 = random.nextInt();  // esse método da um número aleatório

        numero2 = random.nextInt(1, 101); // você pode colocar um limite para os números aleatórios. Esse limite fica entre 1 a 100, pq o último (no caso, 101) não conta

        numero3 = random.nextDouble(); // double fica entre 0 a 1 com números decimais

        cara = random.nextBoolean(); // aleatoriamente escolhe se é verdadeiro ou falso

        if(cara){
            System.out.println("É cara!");
        }else{
            System.out.println("É coroa!");
        }

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);

    }
}
