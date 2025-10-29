package M13_ClassesMetodosAbstratos.Taxes.application;

import M13_ClassesMetodosAbstratos.Taxes.entities.Corporation;
import M13_ClassesMetodosAbstratos.Taxes.entities.Individual;
import M13_ClassesMetodosAbstratos.Taxes.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //NOTE: variaveis ou coleções de tipo abstrato (TaxPayer)
        //NOTE: usar tipo generico na coleçao para polimorfismo, list declarada do tipo da superclasse
        //NOTE: dessa forma a list aceita dados de todas as subclasses (Individual ou Corporation)

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthcareExpenses = sc.nextDouble();

                list.add(new Individual(name, annualIncome, healthcareExpenses));
            }

            else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int totalEmployees = sc.nextInt();

                list.add(new Corporation(name, annualIncome, totalEmployees));
            }
            else {
                System.out.println("Invalid option.");
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list){
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : list){
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}
