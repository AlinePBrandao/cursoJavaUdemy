package M3_EstruturasCondicionais.Exercicios;

import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int a = sc.nextInt();
        System.out.println("Digite o 2° número: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("São Múltiplos");
        }
        else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
