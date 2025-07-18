import java.util.Scanner;

public class ProgramaAcaharOindexDeUmArray {
    public static void main(String[] args){

        // Achar o index de um elemento específico dentro do array

        Scanner scanner = new Scanner(System.in);
        int numeros[] = {1, 2, 6, 9, 4, 5};
        int alvo = 7;  // elemento alvo
        boolean encontrado = false;

        for(int i = 0; i < numeros.length; i++){   // usa-se o método length para indicar o tamanho do array
            if(alvo == numeros[i]){                // usa-se if para ele verificar todos os elementos até encontrar o alvo
                System.out.println("O número " + alvo + " está na posição: " + i);
                encontrado = true;
                break;                             // se achar o elemento antes do array acabar, o break vai interromper o loop
            }
        }

        if(!encontrado){
            System.out.println("Elemento não encontrado no array");
        }




        String frutas[] = {"Banana", "Laranja", "Maçã", "Melão", "Morango", "Melancia", "Ameixa", "Abacaxi"};

        System.out.print("Digite a fruta que você deseja: ");
        String frutaDesejada = scanner.nextLine();
        boolean frutaEncontrada = false;


        for(int i = 0; i < frutas.length; i++){
            if(frutaDesejada.equalsIgnoreCase(frutas[i])){
                System.out.println("A fruta desejada está na posição: " + i);
                frutaEncontrada = true;
                break;
            }
        }

        if(!frutaEncontrada){
            System.out.println("Não temos essa fruta no momento!");
        }

        scanner.close();
    }
}
