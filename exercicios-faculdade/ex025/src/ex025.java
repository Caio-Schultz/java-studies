import java.util.Scanner;
public class ex025 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[20];


    for(int i = 0; i < 20; i++) {
        System.out.print("Digite um número: ");
        numeros[i] = scanner.nextInt();
    }
    int i = 0;
    double soma = 0;
    double media;
    while(i <20){
        soma = soma + numeros[i];
        i++;
    }
        media = soma / 20;
        System.out.printf("Essa é a soma: %.1f\n", soma);
        System.out.printf("Essa é a média: %.2f", media);

        scanner.close();
    }
}
