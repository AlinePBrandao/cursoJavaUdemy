package M3_EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os minutos totais utilizados:");
        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100){
            conta += (minutos - 100) * 2; //conta (50) = conta(50) + (minutos - 100) * 2
        }
        System.out.printf("Valor a pagar = R$ %.2f", conta);
    }
}
