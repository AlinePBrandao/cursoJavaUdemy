package M9_Lists.Salary.application;

import M9_Lists.Salary.entities.EmployeeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeList> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<n; i++){
            System.out.println();
            System.out.println( "Employee #" + (i+1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            //para não ser possível repetir id
            while (hasId(list, id)){
                System.out.println("Id already taken! Try again");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine(); //consume a quebra de linha
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            EmployeeList emp = new EmployeeList(id, name, salary);

            list.add(emp); //insere o obj Employee inserido acima
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        EmployeeList emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null); //função lambda
        //filtra somente funcionario x tal que x.getId = idSalary ou seja somente funcionários id = idSalary e selct o 1°
        if (emp == null){
            System.out.println("This id doesn't exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeList e : list){
            System.out.println(e);
        }

        sc.close();
    }
    //função auxiliar para consultar id com expressão lambda
    public static boolean hasId(List<EmployeeList> list, int id){
        EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return  emp != null;
    }
}
