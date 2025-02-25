package M6_OOJava.Estoque.application;

import M6_OOJava.Estoque.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product.toString()); //java chama o toString implicitamente nesse caso, mesmo sem a chamada aqui
//        product.toString() //converte objeto para String

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity); //atualiza a qtd dentro do pbjeto product

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        sc.close();
    }
}
//product.equals();
//equals é uma operação definida na classe object
//equals não existe na classe Product, porénm existe na variável product, porque o objeto é do tipo Product - que também é do tipo Object