package M12.HerancaPolimorfismo.Heranca.entities;

public class BusinessAccount extends Account{
//extends "importa" a classe
    private Double loanLimit;

    //constructor terá os argumentos da classe Account
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //superclasse para não repetir as atribuições
        //super executa a lógica da classe base - Account
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){ //dinheiro só pode sem emprestado se a quantia for menor que o limite de empréstimo
            deposit(amount); //dinheiro entra na conta por meio de um depósito
        }
    }
}
