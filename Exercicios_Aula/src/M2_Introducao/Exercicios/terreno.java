package M2_Introducao.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //para . no lugar de ,
        Scanner sc = new Scanner(System.in); //entrada de dados pelo usuário

        double largura;
        double comprimento;
        double valorMetroQuadrado;

        System.out.println("Digite a largura do terreno:");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno:");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor por metro quadrado do terreno:");
        valorMetroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorMetroQuadrado;

        System.out.printf("Area do Terreno = %.2f %n", area);
        System.out.printf("Preço do Terreno = %.2f %n", preco);


    }
}
