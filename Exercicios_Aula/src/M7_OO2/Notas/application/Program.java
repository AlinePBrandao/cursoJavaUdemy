package M7_OO2.Notas.application;

import M7_OO2.Notas.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter first grade: ");
        double grade1 = sc.nextDouble();
        System.out.print("Enter second grade: ");
        double grade2 = sc.nextDouble();
        System.out.print("Enter third grade: ");
        double grade3 = sc.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.println();
        System.out.println("Student data: ");
        System.out.print(student.toString());

        sc.close();
    }
}
