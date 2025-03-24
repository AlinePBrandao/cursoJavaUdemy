package M7_OO2.Bank.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    //é possível informar apenas nome e conta
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    //também é possível informar nome, conta e depósito inicial
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //protege o construtor em caso de alteração de regra se necessário
    }

    //como os atributos são privados é necessário ter os métodos de acesso:

    public int getNumber() { //sem get porque num de conta não pode ser alterado
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() { //sem get porque o saldo só pode ser alterado com depósito e saque
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0; //saldo - saque + 5.0
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: $" + balance;
    }
}
