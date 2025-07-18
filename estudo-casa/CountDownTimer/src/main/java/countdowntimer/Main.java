package countdowntimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){


        // Java CountDown Program

        int quantidadeDeSegundos;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos segundos para fazer uma contagem regressiva: ");
        quantidadeDeSegundos = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = quantidadeDeSegundos;


            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Feliz Ano Novo!");
                    timer.cancel();
                }
            }
        };


        timer.schedule(task, 0, 1000);

        scanner.close();
    }
}
