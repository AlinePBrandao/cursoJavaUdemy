package M8_Arrays.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum, average;

        System.out.print("How many numbers are you going to enter? ");
        int n = sc.nextInt();
        double [] vect = new double[n];
        for (int i = 0; i< vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }
        sum = 0;
        for (int i = 0; i< vect.length; i++){
            sum = sum + vect[i];
        }

        average = sum / n;

        System.out.print("Values: ");
        for (int i = 0; i< vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("\nSUM = %.1f %n", sum);
        System.out.printf("AVERAGE = %.1f %n", average);

        sc.close();
    }
}
