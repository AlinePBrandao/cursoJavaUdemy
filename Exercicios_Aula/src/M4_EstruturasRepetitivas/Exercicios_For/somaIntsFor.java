package M4_EstruturasRepetitivas.Exercicios_For;

import java.util.Scanner;

public class somaIntsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° valor");
        int n1 = sc.nextInt();
        System.out.println("Digite o 2° valor");
        int n2 = sc.nextInt();

        int min, max;
        if (n1<n2){
            min = n1;
            max = n2;
        }
        else {
            min = n2;
            max = n1;
        }
        int soma = 0;
        for (int i=min+1; i<max ; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
