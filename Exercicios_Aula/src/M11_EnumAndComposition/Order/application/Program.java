package M11_EnumAndComposition.Order.application;

import M11_EnumAndComposition.Order.entities.Client;
import M11_EnumAndComposition.Order.entities.Order;
import M11_EnumAndComposition.Order.entities.OrderItem;
import M11_EnumAndComposition.Order.entities.Product;
import M11_EnumAndComposition.Order.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next()); //parse converte string p data

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next()); //converte strinng p valor correspondente d status

        Order order = new Order(new Date(), status, client); //data com horaario do sistema
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem it = new OrderItem(quantity, productPrice, product);
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
