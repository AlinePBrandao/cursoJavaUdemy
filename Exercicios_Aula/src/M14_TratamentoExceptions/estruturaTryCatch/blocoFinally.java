package M14_TratamentoExceptions.estruturaTryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class blocoFinally {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\aline\\OneDrive\\Documentos\\Java Materiais\\in.txt");
        //NOTE: recebendo arquivo local
        Scanner sc = null;
        try {
            sc = new Scanner(file); //NOTE: Scanner instanciado apontando para ler o arquivo
            while (sc.hasNextLine()){ //NOTE: se o arquivo existir, ler o arquivo
                System.out.println(sc.nextLine());
            }
        }
        //NOTE: caso o arquivo não seja encontrado a exceção será mostrada
        catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        //NOTE: independente de dar certo ou não o Scanner será fechado
        finally {
            //NOTE: executado independentemente do bloco try dar certo ou não
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
