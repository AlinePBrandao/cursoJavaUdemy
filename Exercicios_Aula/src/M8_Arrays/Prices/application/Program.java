package M8_Arrays.Prices.application;

import M8_Arrays.Prices.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of products: ");
        int n = sc.nextInt(); //tamanho do vetor
        Products[] vect = new Products[n]; //instanciou classe Products

        System.out.println("Enter the Name and Price of the products: ");
        //corpo do vetor + instância
        for (int i=0; i< vect.length; i++){ //vetor
            sc.nextLine(); //quebra de linha pendente
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Products(name, price); //instância do novo produto, vec[i] aponta para ele
        }

        double sum = 0;
        for (int i=0; i< vect.length; i++){ //vect.length = tamanho do vetor
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVAREGE PRICE = %.2f %n", avg);

        sc.close();
    }
}
