package M4_EstruturasRepetitivas.Exercicios_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class conversorFahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;//como a variável estará também fora das chaves do, é necessário declará-la fora
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f %n",f );
            System.out.println("Deseja repetir? (s/ n)");
            resp = sc.next().charAt(0);
        }
        while (resp != 'n');

        sc.close();
    }
}
