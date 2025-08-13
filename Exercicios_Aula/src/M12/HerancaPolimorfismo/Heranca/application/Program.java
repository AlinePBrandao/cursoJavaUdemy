package M12.HerancaPolimorfismo.Heranca.application;

import M12.HerancaPolimorfismo.Heranca.entities.Account;
import M12.HerancaPolimorfismo.Heranca.entities.BusinessAccount;
import M12.HerancaPolimorfismo.Heranca.entities.SavingsAccount;

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
    }
}
