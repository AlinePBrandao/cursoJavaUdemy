package M7_OO2.EstoqueThisSobrecarga.application;

import M7_OO2.EstoqueThisSobrecarga.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine(); //variável auxiliar temporária
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Products products = new Products(name, price);

        System.out.println();
        System.out.println("Product data: " + products.toString());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity); //atualiza a qtd dentro do pbjeto product

        System.out.println();
        System.out.println("Updated data: " + products.toString());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + products.toString());

        sc.close();
    }
}