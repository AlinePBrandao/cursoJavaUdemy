package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class testesDeMesa {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//
//        sc.close();

        int x = 8;
        int y = 3;
        for (int i=0; y<x; i++){
            x -= 2;
            y += 1;
            System.out.print(i);
        }
    }
}
// i 0, 1, 2
// x 8, 6, 4
// y 3, 4, 5
//result 0, 1
