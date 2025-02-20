package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class tabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        for (int i=0; i<=10; i++){
            int tabuada = i * n;
            System.out.println(i + "X" + n + "=" + tabuada);
        }

        sc.close();
    }
}
