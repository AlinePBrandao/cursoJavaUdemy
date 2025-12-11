package M15_Archives;

import java.io.File;
import java.util.Scanner;

public class filePathInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //NOTE: usuario informa uma pasta destino
        System.out.print("Enter a fale path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //NOTE: acessar somente o nome do arquivo
        System.out.println("getName: " + path.getName());

        //NOTE: acessar somente o caminho do arquivo
        System.out.println("getParent: " + path.getParent());

        //NOTE: acessar todo o caminho completo do arquivo
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
