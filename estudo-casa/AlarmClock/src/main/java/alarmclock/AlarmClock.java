package alarmclock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;


    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }
    @Override
    public void run(){


        while(LocalTime.now().isBefore(alarmTime)){
           try {
               Thread.sleep(1000);    // faz com que a cada segundo o tempo atual aumente um segundo

               LocalTime now = LocalTime.now();

               System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());  // \r faz com que o tempo atual seja substuído na mesma linha a cada segundo, e o 02 é para caso o horário tiver apenas um dígito em alguma unidade de medida seja completado com um 0
           }
           catch (InterruptedException e){
               System.out.println("Thread foi interrompida!");
           }
        }


        System.out.println("\n*Barulho de Alarme*");
        playSound(filePath);
    }
    private void playSound(String filePath){

            File audioFile = new File(filePath);


        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Aperte Enter para parar o alarme: ");
            scanner.nextLine();
            clip.stop();

             scanner.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Formato de áudio não é suportado!");
        }
        catch (LineUnavailableException e) {
            System.out.println("Áudio está indisponível!");
        }
        catch(IOException e){
            System.out.println("Erro ao carregar o áudio!");
        }

    }
}
