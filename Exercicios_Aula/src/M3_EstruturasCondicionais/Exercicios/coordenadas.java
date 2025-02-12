package M3_EstruturasCondicionais.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1° coordenada");
        double x = sc.nextDouble();
        System.out.println("Digite a 2° coordenada");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrante Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrante Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrante Q3");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Quadrante Q4");
        }
        else {
            System.out.println("Inválido");
        }
        sc.close();
    }
}
