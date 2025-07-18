package threading;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);   // quantidade de milisegundos; 1000 milisegundos = 1 segundo
            }
            catch(InterruptedException e){
                System.out.println("Thread foi interrompida!");
            }

            if(i == 5){
                System.out.println("Tempo acabou!");
                System.exit(0);    // faz com que o programa termine caso passe os 5 segundos
            }
        }
    }
}
