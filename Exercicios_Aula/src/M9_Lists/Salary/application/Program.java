package M9_Lists.Salary.application;

import M9_Lists.Salary.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] vect = new Employee[n];

        for (int i=0; i< vect.length; i++){
            System.out.println( "Employee #" + i+1 + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Employee(id, name, salary);
        }



        sc.close();
    }
}
