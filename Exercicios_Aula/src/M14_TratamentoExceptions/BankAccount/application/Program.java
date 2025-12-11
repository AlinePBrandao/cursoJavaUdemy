package M14_TratamentoExceptions.BankAccount.application;

import M14_TratamentoExceptions.BankAccount.entities.Account;
import M14_TratamentoExceptions.BankAccount.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount); //pode lançar uma exception
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (BusinessException e){ //captura a exception
            System.out.println(e.getMessage());
            //NOTE: String com a mensagem de erro foi armazenada dentro da BusinessException (String msg)
        }
        //NOTE: acc.withdraw(amount) chama o metodo withdraw em Account, em seguida é testado o metodo validateWithdraw

        sc.close();
    }
}
