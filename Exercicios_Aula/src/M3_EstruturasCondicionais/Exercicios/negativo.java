package M3_EstruturasCondicionais.Exercicios;

import java.util.Scanner;

public class negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número desejado:");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Número Positivo");
        }
        else{
            System.out.println("Número Negativo");
        }
        sc.close();
    }
}
