package alarmclock;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Java Alarm Clock

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "Jammin-Bread-Casa-Rosa_s-Tulum-Vibes.wav";

        while(alarmTime == null){
            try {

                System.out.print("Digite o horário para tocar o alarme (HH:MM:SS): ");
                String tocarAlarme = scanner.nextLine();

                alarmTime = LocalTime.parse(tocarAlarme, formatter);
                System.out.println("Alarme definido para " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Esse formato não é válido. Por favor, use o formato HH:MM:SS");
            }
        }


        AlarmClock alarm = new AlarmClock(alarmTime, filePath, scanner);

        Thread alarmThread = new Thread(alarm);
        alarmThread.start();




    }
}
