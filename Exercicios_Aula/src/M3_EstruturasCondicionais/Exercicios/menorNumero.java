package M3_EstruturasCondicionais.Exercicios;

import java.util.Scanner;

public class menorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3){
            System.out.println("Menor = " + n1);
        }
        else if (n2 < n3){
            System.out.println("Menor = " + n2);
        }
        else {
            System.out.println("Menor = " + n3);
        }

        sc.close();
    }
}
