
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args){

        /* Faça um programa JAVA que leia 3 pares de valores, sendo o primeiro valor o
        número do atleta e o segundo a altura (em cm) do atleta. Escreva:
        a. o número e a altura do atleta mais alto.
        b. a altura média do grupo de atletas.
        c. o número de atletas com altura menor que 178 cm.
         */

        Scanner scanner = new Scanner(System.in);
        double matrizAtleta[][] = new double[3][2];
        double somaAltura = 0;
        double maiorAltura = 0;
        double numeroAtletaMaisAlto = 0;
        double mediaAlturaAtletas;
        double atletasMenores178 = 0;


        for(int i = 0; i < 3; i++){
                System.out.print("Digite o número do atleta: ");
                matrizAtleta[i][0] = scanner.nextInt();
                System.out.print("Digite a altura do atleta: ");
                matrizAtleta[i][1] = scanner.nextDouble();
                if(matrizAtleta[i][1] < 1.78){
                    atletasMenores178++;
                }
        }


        for(int i = 0; i < 3; i++){
            if(matrizAtleta[i][1] > maiorAltura){
                maiorAltura = matrizAtleta[i][1];
                numeroAtletaMaisAlto = (int) matrizAtleta[i][0];
            }
        }

        System.out.println("A maior altura é " + maiorAltura + " m e o número do atleta mais alto é " + numeroAtletaMaisAlto);

        for(int i = 0; i < 3; i++){
            somaAltura = somaAltura + matrizAtleta[i][1];
        }

        mediaAlturaAtletas = somaAltura / 3;

        System.out.printf("A média das alturas dos atletas é: %.2f\n", mediaAlturaAtletas);

        System.out.println("O número de atletas menores que 1,78 é: " + atletasMenores178);
















        scanner.close();
    }
}
