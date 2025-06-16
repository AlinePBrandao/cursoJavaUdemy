package M8_Arrays.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class AveragePairs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, evenSum = 0, nPairs = 0;
        double average;

        System.out.print("How many numbers are you going to enter? ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i<vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i<vect.length; i++){
            if( vect[i] % 2 == 0){
                evenSum = evenSum + vect[i];
                nPairs++;
            }
        }

        if (nPairs == 0){
            System.out.println("No Even Numbers");
        }
        else {
            average = (double) evenSum / nPairs;
            System.out.printf("Average of Even Numbers: %.1f%n", average);
        }
        sc.close();
    }
}
