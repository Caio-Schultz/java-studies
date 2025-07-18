package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        /*  Como ler um arquivo usando Java (3 opções populares)

            BufferedReader + FileReader = melhor para ler arquivos de textos linha por linha
            FileInputStream = Melhor para arquivos binários (e.g., imagens, arquivos de áudio)
            RandomAccessFile = Melhor para ler/escrever porções específicas de um arquivo grande

         */

        String filePath = "C:\\Users\\caiom\\OneDrive\\Documents\\estudos\\java\\testeJava.txt";


       // BufferedReader reader = new BufferedReader(new FileReader(filePath));  // é necessário colocar de argumento um objeto de FileReader, por isso essa opção é uma combinação de BufferedReader e FileReader

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){      // 'e' é um nickname, é necessário colocar para funcionar
            System.out.println("Não é possível localizar o arquivo!");
        }
        catch(IOException e){
            System.out.println("Alguma coisa deu errado!");
        }


    }
}
