package M15_Archives;

import java.io.File;
import java.util.Scanner;

public class manipulatingPath_WithFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //NOTE: usuario informa uma pasta destino
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //NOTE: uma variavel do tipo path pode ser caminho de arquivo ou pasta

        //NOTE: gera listagem das pastas existentes no caminho informado
        File[] folders = path.listFiles(File::isDirectory);
       //NOTE: isDirectory lista somente diretorios ou pastas

        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        //NOTE: apenas a lista de arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files){
            System.out.println(file);
        }

        //NOTE: criacao de uma subpasta a partir da pasta informada
        boolean success = new File(strPath + "//Pastinha Nova").mkdir();
        //NOTE: funçao retorna boolean indicando sucesso
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
