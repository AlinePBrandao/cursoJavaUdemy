package M12.HerancaPolimorfismo.Heranca.application;

import M12.HerancaPolimorfismo.Heranca.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount();

        account.withdraw(); //Possibilita o acesso a todos os atrivutos da lasse
    }
}
