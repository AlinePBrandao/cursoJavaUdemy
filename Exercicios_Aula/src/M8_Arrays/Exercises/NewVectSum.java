package M8_Arrays.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class NewVectSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number in the vector are you going to enter? ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter the values of vector A: ");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B: ");
        for (int i = 0; i<n; i++){
            b[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("Resultant vector: ");
        for (int i = 0; i<n; i++){
            System.out.printf("%d\n", c[i]);
        }
        sc.close();
    }
}
