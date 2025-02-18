package M4_EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class coordenadasWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Informe as coordenadas: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            }else {
                System.out.println("Quarto Quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
