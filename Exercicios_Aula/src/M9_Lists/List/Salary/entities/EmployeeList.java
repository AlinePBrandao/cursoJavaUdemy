package M9_Lists.List.Salary.entities;

public class EmployeeList {
    private int id;
    private String name;
    private double salary;

    public EmployeeList(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        salary += + salary * percentage / 100.0;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
