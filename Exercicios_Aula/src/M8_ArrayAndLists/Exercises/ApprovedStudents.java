package M8_ArrayAndLists.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ApprovedStudents {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are you going to enter? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        String[] name = new String[n];
        double[] grade1 = new double[n];
        double[] grade2 = new double[n];

        for (int i=0; i< vect.length; i++){
            System.out.printf("Enter the %d students name, 1st and 2nd grade: \n", i+1);
            sc.nextLine();
            name[i] = sc.nextLine();
            grade1[i] = sc.nextDouble();
            grade2[i] = sc.nextDouble();
        }

        double averageGrade = 0;

        System.out.println("Approved Students: ");
        for (int i=0; i< vect.length; i++){
            averageGrade = (grade1[i] + grade2[i]) / 2;

            if (averageGrade >= 6.0){
                System.out.printf("%s\n", name[i]);
            }
        }

        sc.close();
    }
}
