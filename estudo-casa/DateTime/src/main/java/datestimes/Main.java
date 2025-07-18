package datestimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        // Como trabalhar com DATES & TIMES usando Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)


        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();  // tempo e data atual em UTC


        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);


        // Formato customizado para mostrar o tempo e a data atual

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // é um dos formatos possíveis
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);

        LocalDate data = LocalDate.of(2025, 12, 25);  // caso você queira uma data específica e não a data atual
        LocalDateTime dataTempo1 = LocalDateTime.of(2025, 12, 25, 20, 30, 59);
        LocalDateTime dataTempo2 = LocalDateTime.of(2026, 1, 1, 0, 0, 1);
        System.out.println(data);
        System.out.println(dataTempo1);
        System.out.println(dataTempo2);

        if(dataTempo1.isBefore(dataTempo2)){
            System.out.println(dataTempo1 + " é antes de " + dataTempo2);
        }
        else if(dataTempo1.isAfter(dataTempo2)){
            System.out.println(dataTempo1 + " é depois de " + dataTempo2);
        }
        else if(dataTempo1.isEqual(dataTempo2)){
            System.out.println(dataTempo1 + " é igual a " + dataTempo2);
        }

    }
}
