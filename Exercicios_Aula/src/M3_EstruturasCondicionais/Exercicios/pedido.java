package M3_EstruturasCondicionais.Exercicios;

import java.util.Scanner;

public class pedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do item: ");
        int codigo = sc.nextInt();
        System.out.println("Digite a quantidade do item: ");
        int qtd = sc.nextInt();

        double total = 0;
        if (codigo == 1){
            total = qtd * 4.00;
            System.out.println("Item: Cachorro Quente");
        }
        else if (codigo == 2) {
            total = qtd * 4.50;
            System.out.println("Item: X-Salada");
        }
        else if (codigo == 3) {
            total = qtd * 5.00;
            System.out.println("Item: X-Bacon");
        }
        else if (codigo == 4) {
            total = qtd * 2.00;
            System.out.println("Item: Torrada Simples");
        }
        else if (codigo == 5) {
            total = qtd * 1.50;
            System.out.println("Item: Refrigerante");
        }
        else {
            System.out.println("Opção Inválida");
        }
        System.out.printf("Total a pagar: %.2f", total);
        sc.close();
    }
}
