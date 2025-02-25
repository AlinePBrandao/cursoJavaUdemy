package M6_OOJava.Area.application;

import M6_OOJava.Area.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        //instanciação
        x = new Triangle(); //alocação dinâmica de memória
        y = new Triangle(); //criação - instanciação- de um objeto Triangle em um outro espaço de memória - Heap.
        //No Heap são armazenados objetos dinâmicos durante a execução.

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); //faz a chamada do método de calculo da classe Triangle
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f %n", areaX);
        System.out.printf("Triangle Y area: %.4f %n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
