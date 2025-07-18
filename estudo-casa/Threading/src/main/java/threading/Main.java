package threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
            THREADING = Permite um programa executar várias tarefas simultaneamente
                        Ajuda a melhorar desempenho com operações que consomem tempo
                        (File I/O, network communications, or any background tasks)

            Como criar uma Thread
            Opção 1 = extender a classe Thread (opção mais simples)
            Opção 2 = Implementar a Interface 'Runnable' (melhor opção)

         */



        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);  // isso faz com que o thread que está no background termine assim que o main thread termine também
        thread.start();

        System.out.println("Você tem 5 segundos para digitar seu nome!");


        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Oi, " + name);



        scanner.close();
    }
}
