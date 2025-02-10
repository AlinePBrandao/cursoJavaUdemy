package M2.Exercicios;

import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        int diferenca, x, y;

        System.out.println("Digite os 4 valores desejados: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        x = A * B;
        y = C * D;

        diferenca = x - y;
        System.out.println("Resultado a * b = " + x);
        System.out.println("Resultado c * d = " + y);
        System.out.println("Diferença = " + diferenca);

        //Ou apenas
        //int diferenca;
        //diferenca = a * b - c * d;
        //System.out.println("Diferença = " + diferenca);

        sc.close();
    }
}
