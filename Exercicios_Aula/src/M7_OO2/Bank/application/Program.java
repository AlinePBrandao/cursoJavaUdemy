package M7_OO2.Bank.application;

import M7_OO2.Bank.entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        System.out.print("Is there an inicial deposit (y/n)? ");
        String answer = sc.next();
        double deposit = 0;
        Account account = new Account(holder, number, deposit);

        if (Objects.equals(answer, "y")){
            System.out.print("Enter inicial deposit value: ");
            deposit = sc.nextDouble();
        }

        System.out.println("Account Data: " + account.toString());

        sc.close();
    }
}