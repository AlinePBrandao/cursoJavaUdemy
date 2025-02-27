package M6_OOJava.MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Forma1 {

    public static final double PI = 3.14159; //final indica que o valor não pode ser alterado
//padrão de nome para constante = letras maiúsculas, +1 adiciona _ - NET_SAL
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);
        double v = volume(radius);

        System.out.printf("Circunference: %.2f %n", c);
        System.out.printf("Volume: %.2f %n", v);
        System.out.printf("CPI: %.2f %n", PI);

        sc.close();
    }
    public static double circunference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
