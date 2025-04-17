package M8_ArrayAndLists.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class HighestPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to enter? ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i=0; i<vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double highestValue = 0;
       int highestPosition = 0;
        for (int i=1; i<vect.length; i++){
            if (vect[i] > highestValue){
                highestValue = vect[i];
                highestPosition = i;
            }
        }

        System.out.printf("Highest value: %.1f \n", highestValue);
        System.out.printf("Highest position: %d \n", highestPosition);

        sc.close();
    }
}
