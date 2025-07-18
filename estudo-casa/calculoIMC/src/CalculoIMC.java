import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double numeroIMC;
        double massa;
        double altura;

        System.out.print("Digite sua massa corporal (em kg): ");
        massa = scanner.nextDouble();

        System.out.print("Digite sua altura (em m e cm): ");
        altura = scanner.nextDouble();

        numeroIMC = massa / Math.pow(altura, 2);

        if(numeroIMC >= 40){
            System.out.println("Seu IMC é " + numeroIMC + " e você está em estado de obesidade mórbida!");
        }
        else if((numeroIMC >= 35) && (numeroIMC < 40)){
            System.out.println("Seu IMC é " + numeroIMC + " e você está em estado de obesidade severa!");
        }
        else if((numeroIMC >= 30) && (numeroIMC < 35)){
            System.out.println("Seu IMC é " + numeroIMC + " e você está em estado de obesidade!");
        }
        else if((numeroIMC >= 25) && (numeroIMC < 30)){
            System.out.println("Seu IMC é " + numeroIMC + " e você está em estado de sobrepeso!");
        }
        else if ((numeroIMC >= 18.5) && (numeroIMC < 25)){
            System.out.println("Seu IMC é " + numeroIMC + " e você está no seu peso ideal!");
        }
        else if ((numeroIMC >= 17) && (numeroIMC < 18.5)){
            System.out.println("Seu IMC é " + numeroIMC + " e você está abaixo do peso!");
        }
        else {
            System.out.println("Seu IMC é " + numeroIMC + " e você está MUITO abaixo do peso!");
        }
        scanner.close();
    }
}
