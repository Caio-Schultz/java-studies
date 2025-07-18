import java.util.Scanner;

public class ProgramaNestedLoops {
    public static void main(String[] args){

        /* Esse programa lê o número de colunas e linhas que o usuário
        quer que a matriz tenha e também lê um simbolo que vai preencher a matriz

        */


        Scanner scanner = new Scanner(System.in);

        int linhas;
        int colunas;
        char simbolo;

        System.out.print("Digite o número de linhas: ");
        linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        colunas = scanner.nextInt();
        System.out.print("Digite o símbolo que você quer que preencha a matriz: ");
        simbolo = scanner.next().charAt(0);

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }

        scanner.close();
    }
}
