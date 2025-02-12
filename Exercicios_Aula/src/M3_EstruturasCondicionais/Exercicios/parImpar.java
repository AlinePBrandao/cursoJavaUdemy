package M3_EstruturasCondicionais.Exercicios;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número Par");
        }
        else {
            System.out.println("Número Impar");

        }
        sc.close();
    }
}
