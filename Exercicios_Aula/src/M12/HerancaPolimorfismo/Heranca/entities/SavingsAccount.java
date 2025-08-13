package M12.HerancaPolimorfismo.Heranca.entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

}
