package M3_EstruturasCondicionais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 3 valores: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2.0) - 4*a*c;
        //double delta = B * B -4 * A * C;//Alternativa
        double r1 = 0;
        double r2 = 0;

        if (a == 0 || delta < 0){
            System.out.println("Impossível calcular");
        }
        else {
            r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("Raiz 1 = %.5f %n", r1);
            System.out.printf("Raiz 2 = %.5f %n", r2);
        }
        sc.close();
    }
}
