package M7_OO2.Bank.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    //CONSTRUCTOR
    //é possível informar apenas nome e conta
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    //CONSTRUCTOR - SOBREPOSIÇÃO
    //também é possível informar nome, conta e depósito inicial
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //protege o construtor em caso de alteração de regra se necessário
    }

    //como os atributos são privados é necessário ter os métodos de acesso:
    //MÉTODOS DE ACESSO
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

    //DEPÓSITO (MÉTODO ENCAPSULADO PARA FACILITAR ALTERAÇÕES FUTURAS)
    public void deposit(double amount){
        balance += amount;
    }
    //SAQUE (MÉTODO ENCAPSULADO PARA FACILITAR ALTERAÇÕES FUTURAS)
    public void withdraw(double amount){
        balance -= amount + 5.0; //saldo - saque + 5.0
    }
    //RETORNO
    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", balance);
    }
}
