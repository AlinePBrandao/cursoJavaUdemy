package M13_ClassesMetodosAbstratos.ClassesAbstratas.application;

import M13_ClassesMetodosAbstratos.ClassesAbstratas.entities.Account;
import M13_ClassesMetodosAbstratos.ClassesAbstratas.entities.BusinessAccount;
import M13_ClassesMetodosAbstratos.ClassesAbstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // NOTE: Teste classes abstratas
        List<Account> list = new ArrayList<>(); // NOTE: List tipo genérico, usando upcasting é possível inserir os outros tipos de conta
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        // NOTE: totalizando saldo de todas as contas
        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        // NOTE: depositando valor em todas as contas
        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }
}
