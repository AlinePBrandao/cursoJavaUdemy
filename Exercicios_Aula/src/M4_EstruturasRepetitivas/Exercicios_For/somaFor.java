package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class somaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os números: ");
        int n = sc.nextInt(); //número de números aceitos

        int soma = 0;
        for (int i = 0; i<n; i++) {
            int x = sc.nextInt(); //númeos digitados
            soma = soma + x;
        }
        System.out.println(soma);

        sc.close();
    }
}

//n = 3
//i = 0, 1<3, 2<3, 3
//x= 5, 2, 4
//soma = 0 , 0+5=5, 5+2=7, 7+4=11


//Fazer um programa que lê um valor interno N e depois N números inteiros. Ao final, mostrar a soma dos N números lidos.