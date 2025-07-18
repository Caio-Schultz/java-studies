package timertimertask;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){

        // Timer = Uma classe que "agenda" tarefas em um tempo específico ou periodicamente
        //         Útil para: mandar notificações, agendar atualizações, ações repetitivas

        // TimerTask = Representa a tarefa que será executada pelo Timer
        //             Você vai extender a classe TimerTask para definir a tarefa
        //             Criar uma subclass para de TimerTask fazendo @Override do método run()


        Timer timer = new Timer();

        TimerTask task = new TimerTask(){  // anonymous class para fazer @Override do método run()

            int count = 3;

            @Override
            public void run(){
                System.out.println("Olá!");
                count--;
                if(count <=0){          // essa estrutura é para que não fique para sempre imprimindo "Olá!"
                    System.out.println("Tarefa Completa!");
                    timer.cancel();     // o método cancel() faz o timer parar
                }
            }
        };

        timer.schedule(task, 3000, 1000);  // o primeiro argumento é a tarefa, o segundo é o delay (em milisegundos) e o terceiro é o tempo (em milisegundos) em que a tarefa vai se repetir periodicamente




    }
}
