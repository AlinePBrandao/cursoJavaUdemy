package M5_OutrosTopicos;

import java.util.Scanner;

public class operadoresBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mask = 0b00100000; //ou 32
        int n = sc.nextInt();
        if ((n & mask) != 0){ //n & bit-a-bit com maskara
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }
        sc.close();
    }
}
