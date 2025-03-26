package M7_OO2.Notas.entities;

public class Student {
    private String name;
    private double grade1, grade2, grade3;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getGrade1(){
        return grade1;
    }
    public double getGrade2(){
        return grade2;
    }
    public double getGrade3(){
        return grade3;
    }


    public double finalGrade(){
        return (grade1 + grade2 + grade3) /3;
    }

    public String getStatus(){
            return finalGrade() >= 7.0 ? "Approved" : "Failed"; //condição ternária
    }

    public String toString(){
        return "Name: " + name + ", Final Grade: " + String.format("%.2f", finalGrade()) + ", Status: " + getStatus();
    }
}
