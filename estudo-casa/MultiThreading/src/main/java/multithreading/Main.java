package multithreading;

public class Main {
    public static void main(String[] args){

        /*
          MULTITHREADING = Habilita um programa executar várias threads simultaneamente
                           (Thread = um conjunto de instruções para executar independentemente)
                           Útil para background tasks ou operações que consomem tempo

         */


        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));

        System.out.println("Game Start");
        thread1.start();
        thread2.start();

        try{
            thread1.join();  // faz com que a execução da thread termine para continuar a execução da thread principal, ou seja, só será printado "Game Over" após as threads terminarem
            thread2.join();
        }
       catch (InterruptedException e){
           System.out.println("Main Thread foi interrompida!");
       }

        System.out.println("Game Over");
    }
}
