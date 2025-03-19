package M7_OO2.Estoque.application;

import M7_OO2.Estoque.entities.Products;

import java.util.Locale;
import java.util.Scanner;

//SOBRECARGA, PALAVRA THIS, ENCAPSULAMENTO

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

        products.setName("Computer"); //altera o nome do produto
        System.out.println("Updated name: " + products.getName());//update do nome
        products.setPrice(1200.00); //altera valor price
        System.out.println("Updated price: " + products.getPrice()); //update do valor

        System.out.println();
        System.out.println("Product data: " + products.toString());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        products.addProducts(quantity); //atualiza a qtd dentro do objeto product

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