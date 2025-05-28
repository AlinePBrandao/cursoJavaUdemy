package M8_ArrayAndLists.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class OlderPerson {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are you going to enter?");
        int n= sc.nextInt();
        int[] vect = new int[n];

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i=0; i<vect.length; i++){
            System.out.printf("Enter the %d person data: \n", i+1);
            System.out.printf("Name: ");
            name[i] = sc.next();
            System.out.printf("Age: ");
            age[i] = sc.nextInt();
        }

        int highestAge = age[0];
        int highestPosition = 0;

        for (int i=0; i<vect.length; i++){
            if (age[i] > highestAge){
                highestAge = age[i];
                highestPosition = i;
            }
        }

        System.out.printf("More Older Person: %s\n", name[highestPosition]);

        sc.close();
    }
}
