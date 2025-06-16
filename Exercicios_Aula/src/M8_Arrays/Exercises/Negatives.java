package M8_Arrays.Exercises;

import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 10: ");
        int n = sc.nextInt();
        if (n > 10){
            System.out.println("Invalid number. Enter another number: ");
            n = sc.nextInt();
        }
        int [] vect = new int[n];
        for (int i = 0; i<vect.length; i++){
            System.out.println("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Negative Numbers: ");
        for (int i = 0; i<vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
