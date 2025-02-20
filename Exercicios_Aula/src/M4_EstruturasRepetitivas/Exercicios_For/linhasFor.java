package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class linhasFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int l1 = i;
            int l2 = i * i;
            int l3 = i * i * i;
            System.out.printf("%d %d %d %n",l1, l2, l3);

        }
        sc.close();
    }
}
