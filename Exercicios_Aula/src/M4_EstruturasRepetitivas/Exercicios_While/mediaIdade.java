package M4_EstruturasRepetitivas.Exercicios;

import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        int soma = 0;
        int qtd = 0;

        while (idade >= 0){
            soma += idade;
            qtd += 1;
            idade = sc.nextInt();
        }
            if (qtd > 0){
                double media = (double) soma / qtd; //para que a divisão de 2 num int retorne num decimla, adicionar um casting (double)
                System.out.printf("Média = %.2f %n", media);
            }
            else {
                System.out.println("Impossível calcular");
            }
        sc.close();
    }
}
