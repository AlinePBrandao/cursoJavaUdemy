package M7_OO2.Streaming.application;

import M7_OO2.Streaming.entities.Signature;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subscription ID: ");
        int id = sc.nextInt();
        sc.nextLine(); //quebra de linha pendente
        System.out.print("Enter subscriber name: ");
        String holder = sc.nextLine();
        System.out.print("Select plan (Basic/Standard/Premium): ");
        String plan = sc.nextLine();

        double payment = 0;
        Signature signature = new Signature(id, holder, plan, payment);

        System.out.println();
        System.out.println("Subscription data: ");
        System.out.print(signature.toString());

        int option;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Make a Payment");
            System.out.println("2 - Change Plan");
            System.out.println("3 - Apply Next Month Fee");
            System.out.println("4 - Cancel Subscription");
            System.out.println("5 - View Subscription Details");
            System.out.println("6 - Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter payment value: ");
                    payment = sc.nextDouble();
                    signature.processPayment(payment);
                    break;
                case  2:
                    signature.changePlan();
                    break;
                case 3:
                    signature.nextMonthFee();
                    System.out.println("Next month subscription fee applied. ");
                    break;
                case 4:
                    signature.cancelSubscription();
                    break;
                case 5:
                    System.out.println(signature.toString());
                    break;
                case 6:
                    System.out.println("Exiting... ");
                    break;
                default:
                    System.out.println("Invalid option! ");
            }
        }
        while (option != 6);
        sc.close();
    }
}
