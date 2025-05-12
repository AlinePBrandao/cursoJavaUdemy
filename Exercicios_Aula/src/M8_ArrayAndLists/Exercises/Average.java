package M8_ArrayAndLists.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double average;

        System.out.print("How many numbers are you going to enter? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i< vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i< vect.length; i++){
            sum = sum + vect[i];
        }
        average = sum / n;

        System.out.printf("Average: %.3f\n", average);
        System.out.println("Below average elements: ");

        for (int i = 0; i< vect.length; i++){
            if (vect[i] < average) {
                System.out.printf("%.1f %n", vect[i]);
            }
        }
        sc.close();
    }
}
