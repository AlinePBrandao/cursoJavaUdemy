package M15_Archives.Exercise.application;

import M15_Archives.Exercise.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter a file path: ");
        String strFile = sc.nextLine();

        File sourceFile = new File(strFile);
        String strFolder = sourceFile.getParent(); //NOTE: obtem caminho desprezando nome do arquivo

        boolean success = new  File(strFolder + "\\out").mkdir();
        String targetFile = strFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itemCsv = br.readLine();
            while (itemCsv != null){

                String[] fields = itemCsv.split(",");
                String product = fields[0];
                double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(product, price, quantity));

                itemCsv = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for (Product item : list){
                    bw.write(item.getProduct() + ", " + String.format("%.2f", item.totalPrice()));
                    bw.newLine();
                }
                System.out.println(targetFile + "CREATED");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
        sc.close();
    }
}
