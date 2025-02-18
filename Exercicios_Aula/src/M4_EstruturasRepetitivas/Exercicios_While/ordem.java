package M4_EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class ordem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (num1 != num2){
            if (num1 > num2){
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        sc.close();
    }
}
