package M2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID do funcionário: ");
        int id = sc.nextInt();
        System.out.println("Digite o total de horas trabalhadas: ");
        double horasTrabalhadas= sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.printf("Id funcionário: %d %nTotal salário = U$ %.2f", id, salario);
        sc.close();
    }
}
