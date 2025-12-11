package M15_Archives;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {
    public static void main(String[] args) {
        String path = "C:\\Users\\aline\\OneDrive\\Documentos\\Java Materiais\\in.txt";

        //NOTE: tentar abrir e ler o arquivo
        //NOTE: Streams declaradas direto no bloco try, FileReader será declarado no construtor do Buffered
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); //NOTE: le uma linha do arquivo

            while (line != null) { //NOTE: significa que leu a linha com sucesso
                System.out.println(line); //NOTE: continue lendo a próxima linha
                line = br.readLine();
            }
        }
        //NOTE: capturar uma exception
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
