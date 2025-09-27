package M12_HerancaPolimorfismo.Heranca.application;

import M12_HerancaPolimorfismo.Heranca.entities.Account;
import M12_HerancaPolimorfismo.Heranca.entities.BusinessAccount;
import M12_HerancaPolimorfismo.Heranca.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex Green", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria Brown", 0.0, 500.0);

//UPCASTING subclasse -> superclasse

        Account acc1 = bacc; //BusinessAccount também é Account, por isso pode ser atribuído. Ou seja, subclasse para superclasse
        Account acc2 = new BusinessAccount(1003, "Bob Blue", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna Red", 0.0, 0.01);

//DOWNCASTING superclasse -> subclasse
        BusinessAccount acc4 = (BusinessAccount)acc2; //necessário fazer casting, pois não se pode converter de Account para BusinessAccount
//acc2 é do tipo Account mesmo sendo instanciada como BusinessAccount
        acc4.loan(100.0);

//BusinessAccount acc5 = (BusinessAccount)acc3; //Não é permitido porque acc3 é do tipo SavingAccount, é uma Account mas não uma Business. Não pode ser convertido

//EVITANDO ERRO NO DOWNCASTING
        if (acc3 instanceof BusinessAccount){ //se obj acc3 for instancia de BusinessAccount
            BusinessAccount acc5 = (BusinessAccount)acc3; //casting
            acc5.loan(200.0); //empréstimo
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

//Sobrescrita método withdraw
        Account acc6 = new Account(1005, "Lina", 1000.0);
        acc6.withdraw(200.0);//saca 200, desconta taxa de 5 da lógica de Account
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1006, "Rafael", 1000.0, 0.01);
        acc7.withdraw(200.0); //saca 200, sem desconto de taxa seguindo lógica de SavingAccount
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1007, "Bruno", 1000.0, 500.0);
        acc8.withdraw(200.0); //saca 200, desconta taxa de 5 da lógica de Account e depois desconta +2 da lógica de Business
        System.out.println(acc8.getBalance());

//Teste Polimorfismo
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println();
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}
