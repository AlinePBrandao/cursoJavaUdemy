package M2.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * raio * raio;
        //OU
        //double quadrado = Math.pow (raio, 2.0);
        //double area = pi * quadrado;
        System.out.printf("Área total = %.4f" , area);
        sc.close();
    }
}
