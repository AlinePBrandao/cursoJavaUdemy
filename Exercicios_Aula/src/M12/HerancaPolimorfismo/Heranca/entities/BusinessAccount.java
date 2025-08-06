package M12.HerancaPolimorfismo.Heranca.entities;

public class BusinessAccount extends Account{

    private Double loanLimit;

    //constructor terá os argumentos da classe Account

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //superclasse para não repetir as atribuições
        this.loanLimit = loanLimit;
    }
}
