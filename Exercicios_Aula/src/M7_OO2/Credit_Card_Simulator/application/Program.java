package M7_OO2.Credit_Card_Simulator.application;

import M7_OO2.Credit_Card_Simulator.entities.Credit_Card;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //FORMAT
        String cardNumb; //declarada fora porque se declarado dentro da condição não será possível ler
        while (true){
            System.out.print("Enter card number (format: XXXX-XXXX-XXXX-XXXX): ");
            cardNumb = sc.nextLine();
            if (cardNumb.matches("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$")){
                break; //sai do loop se estiver correto
            }
            System.out.println("Invalid format! Please enter in XXXX-XXXX-XXXX-XXXX format.");
        }

        System.out.print("Enter card holder: ");
        String holder = sc.nextLine();
        System.out.print("Enter card limit: ");
        double creditLimit = sc.nextDouble();

        double balance = 0;

        Credit_Card creditCard = new Credit_Card(cardNumb, holder, creditLimit, balance);

        System.out.println();
        System.out.println("Card data: ");
        System.out.print(creditCard.toString());

        System.out.println();
        System.out.printf("%nEnter purchase value: ");
        double purchase = sc.nextDouble();
        creditCard.purchase(purchase);
        System.out.println("Updated card data: ");
        System.out.print(creditCard.toString());

        System.out.println();
        System.out.printf("%nEnter payment value: ");
        double payment = sc.nextDouble();
        creditCard.payment(payment);
        System.out.println("Updated card data: ");
        System.out.print(creditCard.toString());

        sc.close();
    }
}
