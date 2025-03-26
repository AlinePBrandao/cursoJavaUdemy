package M7_OO2.Credit_Card_Simulator.entities;

public class Credit_Card {
    private String cardNumb;
    private String holder;
    private double creditLimit;
    public double balance;

    //FORMATAR NUM CARTÃO
    public Credit_Card (String cardNumb, String holder, double creditLimit, double balance){
        if (!isValidCardNumb(cardNumb)) { //validar formato do número do cartão
            throw new IllegalArgumentException("Invalid card number format! Use XXXX-XXXX-XXXX-XXXX.");
        }
        this.cardNumb = cardNumb;
        this.holder = holder;
        this.creditLimit = creditLimit;
        this.balance = balance; //java se inicia de 0 em automático
    }

    //FORMATO ACEITO CARTÃO
    private boolean isValidCardNumb(String cardNumb) {
        return cardNumb.matches("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$");
    }


//    public String getCardNumb() {
//        return cardNumb;
//    }
//
//    public String getHolder() {
//        return holder;
//    }
//
//    public void setHolder(String holder) {
//        this.holder = holder;
//    }
//
//    public double getCreditLimit() {
//        return creditLimit;
//    }
//
//    public void setCreditLimit(double creditLimit) {
//        this.creditLimit = creditLimit;
//    }

    //Compra - sem limite / com limite
    public boolean purchase(double amount){
        if (balance + amount > creditLimit){
            System.out.println("Purchase declined! Limit exceded.");
            return false;
        }
        balance += amount;
        return true;
    }
    public void payment(double amount){
        balance -= amount;
    }

    public String toString(){
        return "Card " + cardNumb + ", Holder: " + holder + ", Limit: $" + String.format("%.2f", creditLimit)
                + ", Balance: $" + String.format("%.2f", balance);
        //MESMA FORMA SÓ QUE MAIS RÁPIDO:
       // System.out.printf("Card %s, Holder: %s, Limit: %.2f, Balance: %.2f", cardNumb, holder, creditLimit, balance);
    }

}
