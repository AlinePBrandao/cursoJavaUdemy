package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class divisaoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pares a serem lidos:");
        int n = sc.nextInt();
        double div = 0;

        for (int i=0; i<n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if (n2 == 0){
                System.out.println("Divisão Impossível");
            }
            else {
                div =(double) n1 / n2;
                System.out.printf("%.1f %n", div);
            }
        }

        sc.close();
    }
}
