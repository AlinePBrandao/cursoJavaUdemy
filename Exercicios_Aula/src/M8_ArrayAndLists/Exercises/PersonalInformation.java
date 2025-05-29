package M8_ArrayAndLists.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people are you going to enter? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i=0; i<vect.length; i++){
            System.out.printf("Enter the %d person height: ", i+1);
            height[i] = sc.nextDouble();
            System.out.printf("Enter the %d person gender: ", i+1);
            gender[i] = sc.next().charAt(0);
        }

        double highestHeight = height[0];
        double lowestHeight = height[0];

        for (int i=1; i<vect.length; i++){
            if (height[i] > highestHeight){
                highestHeight = height[i];
            }
            if (height[i] < lowestHeight){
                lowestHeight = height[i];
            }
        }

        int totalMen = 0;
        int totalWomen = 0;
        double heightWomen = 0.0;

        for (int i=0; i<vect.length; i++){
            if (gender[i] == 'F'){
                totalWomen++;
                heightWomen = heightWomen + height[i];
            }
            else if (gender[i] == 'M'){
                totalMen++;
            }
        }

        double averageHeightWomen = heightWomen / totalWomen;
        System.out.printf("Highest height: %.2f%n", highestHeight);
        System.out.printf("Lowest height: %.2f%n", lowestHeight);
        System.out.printf("Average height of women: %.2f%n", averageHeightWomen);
        System.out.print("Quantity of men: " + totalMen);

        sc.close();
    }
}
