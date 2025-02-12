package M2_Introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class pecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Id do produto, Quantidade e Valor do produto 1:");
        int id1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        System.out.println("Digite Id do produto, Quantidade e Valor do produto 2:");
        int id2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);
        System.out.printf("Valores e Quantidades = %d - %.2f, %d - %.2f %n", qtd1, valor1, qtd2, valor2);
        System.out.printf("Total a pagar = $ %.2f" , total);
        sc.close();
    }
}
