package M11_EnumAndComposition.IncomeWorker.entities;

import M11_EnumAndComposition.IncomeWorker.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private double name;
    private WorkerLevel level;
    private double baseSalary;

    private  Department department;
    private List<HourContract> contracts = new ArrayList<>(); //Worker tem vários contratos, sendo assim, List

    public Worker (double name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        //constructor não contém o list
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Contracts sem set porque a lista não pode ser trocada por outra

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public void addContract(HourContract contract){
        contracts.add(contract); //adiciona contratos
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    //baseSalary + contracts
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        //percorrer contratos para selecionar os do mês referido
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); //mês do calendar começa em 0, add +1
            if (year == c_year && month == c_month){
                sum += c.totalValue(); //para somar os contratos
            }
        }
        return sum;
    }




}
