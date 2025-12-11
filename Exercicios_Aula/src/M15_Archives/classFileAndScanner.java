package M15_Archives;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class classFileAndScanner {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\aline\\OneDrive\\Documentos\\Java Materiais\\in.txt");
        //NOTE: recebendo arquivo local
        Scanner sc = null;
        //NOTE: arquivo aberto no bloco try porque pode ser gerada uma exception
        try {
            sc = new Scanner(file); //NOTE: Scanner instanciado apontando para ler o arquivo
            while (sc.hasNextLine()){ //NOTE: ler linhas existentes no arquivo
                System.out.println(sc.nextLine());
            }
        }
        //NOTE: caso o arquivo não seja encontrado a exceção será mostrada
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        //NOTE: executado independentemente do bloco try dar certo ou não
        finally {
            if (sc != null){
                sc.close();  //NOTE: independente de dar certo ou não o Scanner será fechado
            }
            System.out.println("Finally block executed");
        }
    }
}

