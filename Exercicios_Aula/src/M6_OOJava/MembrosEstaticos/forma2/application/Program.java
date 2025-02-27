package M6_OOJava.MembrosEstaticos.forma2.application;

import M6_OOJava.MembrosEstaticos.forma2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator(); //instancia do objeto

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator.circunference(radius); //chamada da operação a partir do objeto
        double v = calculator.volume(radius); //chamada da operação a partir do objeto

        System.out.printf("Circunference: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("CPI: %.2f %n", calculator.PI); //chamada da operação a partir do objeto

        sc.close();
    }
}

