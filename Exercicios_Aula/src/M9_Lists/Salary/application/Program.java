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

        Integer pos = position(list, idSalary); //procurando a posição do idSalary na lista
        if (pos == null){
            System.out.println("This id doesn't exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeList emp : list){
            System.out.println(emp);
        }

        sc.close();
    }
    //função auxiliar para consultar id - dá a posição na lista
    public static Integer position(List<EmployeeList> list, int id){
        for (int i=0; i< list.size(); i++){
            if (list.get(i).getId() == id){  //get pega o elemento na posição = se o elemento na posição i id = id
                return i;
            }
        }
        return null;
    }
}
