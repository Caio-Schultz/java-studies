import java.util.Scanner;

public class ex1072 {
    public static void main(String[] args){
        /*Leia um valor inteiro N.
         Este valor será a quantidade de
         valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20]
         e quantos estão fora do intervalo, mostrando essas informações
        */

        Scanner scanner = new Scanner(System.in);
        int quantidadeDeValoresLidos;

        System.out.print("Digite uma quantidade de valores a serem lidos: ");
        quantidadeDeValoresLidos = scanner.nextInt();

        int valoresLidos[] = new int[quantidadeDeValoresLidos];
        int contagemDeNumerosEntre10e20 = 0;
        int contagemDeNumerosForaDoLimiteDe10e20 = 0;



        for(int i = 0; i < quantidadeDeValoresLidos; i++){
            System.out.print("Digite um número qualquer: ");
            valoresLidos[i] = scanner.nextInt();
            if((valoresLidos[i] >= 10) && (valoresLidos[i] <= 20)){
                contagemDeNumerosEntre10e20++;
            }
            else{
                contagemDeNumerosForaDoLimiteDe10e20++;
            }
        }

        System.out.println("Números no intervalo de 10 a 20: " + contagemDeNumerosEntre10e20);
        System.out.println("Números fora do intervalo de 10 a 20: " + contagemDeNumerosForaDoLimiteDe10e20);




        scanner.close();
    }
}
