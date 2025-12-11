package M15_Archives;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader_BufferedReader {
    public static void main(String[] args) {

        String path = "C:\\Users\\aline\\OneDrive\\Documentos\\Java Materiais\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        //NOTE: tentar abrir e ler o arquivo
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

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
        finally {
            try{
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace(); //NOTE: mostra o erro
            }
        }
    }
}
