package M11_EnumAndComposition.IncomeWorker.application;

import M11_EnumAndComposition.IncomeWorker.entities.Department;
import M11_EnumAndComposition.IncomeWorker.entities.HourContract;
import M11_EnumAndComposition.IncomeWorker.entities.Worker;
import M11_EnumAndComposition.IncomeWorker.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName)); //departament associado ao objeto worker
        //WorkerLevel referente a classe tipo enum, workerLevel refere ao valor string declarado
        //instancia do tipo enum WorkerLevel

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i=1; i<n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next()); //exceção tratada com throws ParseException em psvm
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            //instanciar contrato
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            //associar contrato com trabalhador
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
       int month = Integer.parseInt(monthAndYear.substring(0, 2)); //recortando string informando posição. Recorta o String gerando substring
        //converter substring p/ int com Integer
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for  " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
