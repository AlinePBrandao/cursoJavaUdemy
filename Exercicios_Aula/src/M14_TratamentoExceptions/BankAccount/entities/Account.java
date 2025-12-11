package M14_TratamentoExceptions.BankAccount.entities;

import M14_TratamentoExceptions.BankAccount.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private  Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    //NOTE: retirei set para que os valores não possam ser alterados livremente

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        validateWithdraw(amount); //se passar, realiza o saque
        balance -= amount;
    }

    private void validateWithdraw(double amount){
        //TODO: desenvolver condicao para saldo insuficiente na conta
        if (amount > getWithdrawLimit()){
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit"); //lança exceção
        }
        //TODO: desenvolver condicao para valor de saque superior ao limite de saque da conta
        if (amount > getBalance()){
            throw new BusinessException("Withdraw error: Not enough balance"); //lança exceção
        }
    }
}
