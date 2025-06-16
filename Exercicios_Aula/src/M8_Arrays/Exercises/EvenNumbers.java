package M8_Arrays.Exercises;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to enter? ");
        int n = sc.nextInt();

        int [] vect = new int[n];
        for (int i=0; i<vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("\nEven Numbers: ");
        int evenNumbers = 0;
        for (int i=0; i<vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                evenNumbers++;
            }
        }

        System.out.printf("\n\nNumber of Pairs: %d\n", evenNumbers);
        sc.close();
    }
}
