import java.util.Scanner;

public class ex1019 {
    public static void main(String[] args){
        /*Leia um valor inteiro,
         que é o tempo de duração em segundos
         de um determinado evento em uma fábrica,
         e informe-o expresso no formato horas:minutos:segundos.
         */

        Scanner scanner = new Scanner(System.in);
        int tempoEmSegundos;
        int segundos;
        int minutos;
        int horas;

        System.out.print("Digite quantos segundos de duração: ");
        tempoEmSegundos = scanner.nextInt();

        if(tempoEmSegundos > 3600){
            segundos = tempoEmSegundos % 60;
            minutos = tempoEmSegundos / 60;
            horas = minutos / 60;
            minutos = minutos % 60;
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
        else if(tempoEmSegundos == 3600){
            horas = 1;
            segundos = 0;
            minutos = 0;
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
        else if((tempoEmSegundos < 3600) && (tempoEmSegundos > 60)){
            segundos = tempoEmSegundos % 60;
            minutos = tempoEmSegundos / 60;
            horas = 0;
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
        else if(tempoEmSegundos == 60){
            horas = 0;
            segundos = 0;
            minutos = 1;
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
        else if((tempoEmSegundos < 60) && (tempoEmSegundos > 0)){
            segundos = tempoEmSegundos;
            horas = 0;
            minutos = 0;
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
        else {
            System.out.println("Valor inválido!");
        }





        scanner.close();
    }
}
