import java.util.Scanner;

public class Pesquisalinear {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int i;
        int numeroElementos;
        boolean valorEncontrado = true;



        System.out.print("Digite o número de pessoas a ser cadastrado: ");
        numeroElementos = scanner.nextInt();

        String vetorPesquisado[] = new String[numeroElementos];

        for(i = 0; i < numeroElementos; i++){
            System.out.print("Digite o nome para cadastro: ");
            vetorPesquisado[i] = scanner.nextLine();
        }

        String elementoProcurado;

        System.out.print("Digite o nome a ser procurado: ");
        elementoProcurado = scanner.nextLine();

        for(i = 0; i < numeroElementos;i++){
            if(vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)){
                System.out.print("O nome " + vetorPesquisado[i] + " está na posição " + i);
                valorEncontrado = false;
            }
        }

        if(valorEncontrado){
            System.out.print("Esse nome não está cadastrado!");
        }





    }
}
