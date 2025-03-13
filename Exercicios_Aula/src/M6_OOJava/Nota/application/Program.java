package M6_OOJava.Nota.application;

import M6_OOJava.Nota.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Enter the student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter the student's grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f %n", student.finalGrade());

        if (student.finalGrade() > 60.0){
            System.out.println("PASS");
        }
        else {
            System.out.printf("FAILED %n");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }
        sc.close();
    }
}
