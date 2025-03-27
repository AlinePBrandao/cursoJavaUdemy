package M7_OO2.Streaming.entities;

import java.util.Scanner;

public class Signature {
    private int id;
    private String holder;
    private String plan;
    private double price;
    private double payment;
    private double balance;

    public Signature(int id, String holder, String plan, double payment){
        this.id = id;
        this.holder = holder;
        setPlan(plan);
        this.payment = payment;
        this.balance = price - payment;
    }
    public void setPlan(String newPlan){
        boolean validPlan = false;
        while (!validPlan){
            switch (newPlan.toLowerCase()){
                case "basic":
                    this.plan = "Basic";
                    this.price = 19.90;
                    return;
                case "standard":
                    this.plan = "Standard";
                    this.price = 39.90;
                    return;
                case "premium":
                    this.plan = "Premium";
                    this.price = 59.90;
                    return;
                default:
                    System.out.println("Invalid plan! Enter a valid plan.");
                    Scanner sc = new Scanner(System.in);
                    newPlan = sc.nextLine();
                    //setPlan(newPlan);
                    break;
            }
        }
    }

    public void processPayment(double payment){
        if (balance > 0){
            double fee = 0.02;
            double lateFee = balance * fee;
            balance += lateFee;
            System.out.printf("Late payment detected! 2%% fee applied: $ %.2f %n", lateFee);
        }
        balance -= payment;
        if (balance < 0) balance = 0;
        System.out.println("Payment processed successfully");
    }

    public void nextMonthFee(){
        balance += price;
    }

    public void changePlan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Change plan to (Basic/Standard/Premium): ");
        String newPlan = sc.nextLine();
        setPlan(newPlan);
        System.out.println("Plan updated. New fee will apply next month");
    }

    public void cancelSubscription(){
        if (balance > 0){
            System.out.println("You must pay your pending balance before canceling. ");
        } else {
            System.out.println("Subscription canceled successfully. ");
        }
    }

    public String toString(){
        return "ID: " + id + ", Name: " + holder + ", Plan: " + plan + ", Monthly Fee: $" + String.format(" %.2f", price) + ", Pending Balance: $" + String.format(" %.2f", balance);
    }
}
