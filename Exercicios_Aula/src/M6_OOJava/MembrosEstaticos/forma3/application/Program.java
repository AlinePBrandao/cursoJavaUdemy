package M6_OOJava.MembrosEstaticos.forma3.application;

import M6_OOJava.MembrosEstaticos.forma3.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //não é mais necessário instanciar o objeto
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunference(radius); //classe referenciada no método estático na classe Calculator
        double v = Calculator.volume(radius); //classe referenciada no método estático na classe Calculator
        //membros usados independente de objetos usando o nome da classe
        System.out.printf("Circunference: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("CPI: %.2f %n", Calculator.PI); //classe referenciada na constante estática na classe Calculator

        sc.close();
    }
}

