package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class fatorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor a ser calculado: ");
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i<=n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
