import java.util.Scanner;

public class ex026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[20];

        for(int i = 0; i < 20; i++){
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }


        scanner.close();
    }
}
