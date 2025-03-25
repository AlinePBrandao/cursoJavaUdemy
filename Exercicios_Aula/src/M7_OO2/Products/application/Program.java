package M7_OO2.Products.application;

import M7_OO2.Products.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product code: ");
        int code = sc.nextInt();
        System.out.print("Enter product name: ");
        String name = sc.next();
        System.out.print("Enter initial stock quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(code, name, quantity);

        System.out.println();
        System.out.println("Product data: ");
        System.out.println(product.toString());

        System.out.println();
        System.out.print("Enter quantity to add: ");
        int add = sc.nextInt();
        product.addProduct(add);
        System.out.println("Updated product data: ");
        System.out.println(product);

        System.out.println();
        System.out.print("Enter quantity to remove: ");
        int remove = sc.nextInt();
        product.removeProduct(remove);
        System.out.println("Updated product data: ");
        System.out.println(product);

        sc.close();
    }
}
