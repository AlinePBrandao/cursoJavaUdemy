package M7_OO2.Bank.application;

import M7_OO2.Bank.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an inicial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        //se y
        if (answer == 'y'){
            System.out.print("Enter inicial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit); //instâcia com constructor de 3 argumentos
        }
        //sobrecarga
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositeValue = sc.nextDouble();
        account.deposit(depositeValue); //realiza o depósito na conta
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdraeValue = sc.nextDouble();
        account.withdraw(withdraeValue); //realiza o saque na conta
        System.out.println("Updated account data: ");
        System.out.println(account);

    }
}