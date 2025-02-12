package M3_EstruturasCondicionais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class notaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe as notas do 1° e 2° semestres: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double total = nota1 + nota2;
        System.out.printf("Nota Final= %.2f %n", total);

        if (total < 60.0){
            System.out.println("Aluno Reprovado");
        }
        else if (total >= 60.0){
            System.out.println("Aluno Aprovado" );
        }
        else {
            System.out.println("Inválido");
        }

        sc.close();
    }
}
