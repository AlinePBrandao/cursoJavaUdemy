package M15_Archives;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_BufferedWriter {
    public static void main(String[] args) {

        //NOTE: mensagem do arquivo
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        //NOTE: caminho para criacao do arquivo
        String path = "C:\\Users\\aline\\OneDrive\\Documentos\\Java Materiais\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //true indica que o arquivo não será recriado, e sim acrescido
            for (String line : lines){
                bw.write(line);
                bw.newLine(); //NOTE: Não faz a quebra de linha automatica
            }
        }
        catch (IOException e){
            e.printStackTrace(); //NOTE: mostra o erro
        }
    }
}
