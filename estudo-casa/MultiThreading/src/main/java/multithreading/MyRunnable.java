package multithreading;

public class MyRunnable implements Runnable{

    private final String texto;

    MyRunnable(String texto){
        this.texto = texto;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(texto);
            }
            catch (InterruptedException e){
                System.out.println("Thread foi interrompida!");
            }
        }
    }
}
