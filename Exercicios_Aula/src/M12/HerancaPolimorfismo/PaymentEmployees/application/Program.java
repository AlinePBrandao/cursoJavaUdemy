package M12.HerancaPolimorfismo.PaymentEmployees.application;

import M12.HerancaPolimorfismo.PaymentEmployees.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine(); //consume quebra de linha pendente
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Valua per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
            }
        }

        sc.close();
    }

}
