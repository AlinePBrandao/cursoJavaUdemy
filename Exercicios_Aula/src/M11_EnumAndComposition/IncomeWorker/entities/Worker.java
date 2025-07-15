package M11_EnumAndComposition.IncomeWorker.entities;

import M11_EnumAndComposition.IncomeWorker.entities.enums.WorkerLevel;

import java.util.ArrayList;
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

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }

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
}
