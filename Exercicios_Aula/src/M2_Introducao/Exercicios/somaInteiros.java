package M2_Introducao.Exercicios;

import java.util.Scanner;

public class somaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x; int y; int soma;
        System.out.println("Digite o 1° número: ");
        x = sc.nextInt();
        System.out.println("Digite o 2° número: ");
        y = sc.nextInt();

        soma = x + y;
        System.out.println( "Soma = " + soma);
        sc.close();
    }
}
