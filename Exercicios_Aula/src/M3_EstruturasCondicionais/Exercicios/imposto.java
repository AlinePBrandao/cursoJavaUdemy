package M3_EstruturasCondicionais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do salário recebido: ");
        double salario = sc.nextDouble();

        double impostoDeRenda = 0;
        if (salario <= 2000.00){
            impostoDeRenda = salario * 0.00;
            System.out.println("Imposto de Renda: Insento");
        } else if (salario > 2000.01 && salario <=3000.00) {
            impostoDeRenda = (salario - 2000.00) * 0.08;
        } else if (salario > 3000.01 && salario <= 4500.00) {
            impostoDeRenda = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        } else if (salario > 4500.00) {
            impostoDeRenda = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }
        else {
            System.out.println("Inválido");
        }
        System.out.printf("Imposto de Renda: R$ %.2f", impostoDeRenda);
        sc.close();
    }
}
