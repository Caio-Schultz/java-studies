package hangmangame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){


        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());// trim() é para tirar qualquer espaço que tenha em alguma linha para não afetar no tamanho da palavra
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        }
        catch(IOException e){
            System.out.println("Algo deu errado!");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));




        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> letrasDaPalavra = new ArrayList<>();
        int escolhaErrada = 0;


            for(int i = 0; i < word.length(); i++){
                letrasDaPalavra.add('_');
            }

        System.out.println("**************************************");
        System.out.println(" Bem-vindo ao Jogo da Forca em Java ");
        System.out.println("**************************************");

        while(escolhaErrada < 6){

            System.out.println(getHangmanArt(escolhaErrada));

            System.out.print("Palavra: ");

            for(char c : letrasDaPalavra){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Escolha uma letra: ");
            char escolha = scanner.next().toLowerCase().charAt(0);  // next() aceita a primeira letra de uma STRING, logo é necessário usar o método charAt() para transformar em um char

            if(word.indexOf(escolha) >= 0) {
                System.out.println("Escolha certa!\n");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == escolha) {
                        letrasDaPalavra.set(i, escolha);

                    }
                }
                if(!letrasDaPalavra.contains('_')){

                    System.out.println(getHangmanArt(escolhaErrada));

                    System.out.print("Palavra: ");

                    for(char c : letrasDaPalavra){
                        System.out.print(c + " ");
                    }
                    System.out.println("\nVocê ganhou!");
                    break;
            }


            }

            else{
                System.out.println("Escolha Errada!\n");
                escolhaErrada++;
            }
        }

        if(escolhaErrada >= 6){
            System.out.println(getHangmanArt(escolhaErrada));
            System.out.println("Game Over!");
            System.out.println("A palavra era: " + word);
        }





        scanner.close();




    }
    static String getHangmanArt(int escolhaErrada){

        return switch(escolhaErrada){
            case 0 -> """
                    
                     
                     
                     """;
            case 1 -> """
                     o
                   
                   
                      
                    """;
            case 2 -> """
                      o
                      |
                      
                    """;
            case 3 -> """
                      o
                      |\\
                      
                    """;
            case 4 -> """
                      o
                     /|\\
                     
                    """;
            case 5 -> """
                      o
                     /|\\
                     /
                    """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                    """;
            default -> "";
        };

    }
}
