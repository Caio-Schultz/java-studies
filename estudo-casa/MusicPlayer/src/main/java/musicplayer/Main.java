package musicplayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        /*
            Como colocar áudio em Java(.wav, .au, .aiff)
         */

        String filePath = "src\\Last Cappuccino in Rio - Chris Haugen.wav";
        File file = new File(filePath);


        try(Scanner scanner = new Scanner(System.in);     // é possível colocar o Scanner e o audioInputStream em um try{} block, pq ambos tem métodos de close(), vai identificar isso e fechar eles automaticamente no final
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String resposta = "";


            while(!resposta.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Restart");
                System.out.println("Q = Quit");
                System.out.print("Digite uma opção: ");
                resposta = scanner.next().toUpperCase();

                switch(resposta){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Opção Inválida");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Não é possível localizar o arquivo!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("O tipo do arquivo de áudio não é suportado!");
        }
        catch(LineUnavailableException e){
            System.out.println("Não é possível acessar o recurso de áudio!");
        }
        catch(IOException e){
            System.out.println("Alguma coisa deu errado!");
        }

    }
}
