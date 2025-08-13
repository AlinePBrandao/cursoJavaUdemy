package M12.HerancaPolimorfismo.Heranca.application;

import M12.HerancaPolimorfismo.Heranca.entities.Account;
import M12.HerancaPolimorfismo.Heranca.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex Green", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria Brown", 0.0, 500.0);

    }
}
