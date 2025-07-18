package writefiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        /* Como escrever um arquivo usando Java (4 opções populares)

           FileWriter = Bom para textos pequenos ou médios
           BufferedWriter = Desempenho melhor para textos grandes
           PrintWriter = Melhor para dados estruturados, tipo relatórios ou registros
           FileOutputStream = Melhor para arquivos binários (e.g., imagens, arquivos de áudio

         */

        String textContent = "Eu gosto de sushi!";


        try (FileWriter writer = new FileWriter("test.txt");){
            writer.write(textContent);    // esse método é utilizado para escrever o arquivo
            System.out.println("Arquivo foi escrito!");
        }
        catch(FileNotFoundException e){
            System.out.println("Não é possível encontrar o arquivo");
        }
        catch(IOException e){
            System.out.println("Não é possível escrever o arquivo");
        }


    }
}
