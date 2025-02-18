package M4_EstruturasRepetitivas;

import java.util.Scanner;

public class whileEstrutura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int x = sc.nextInt();

        int soma = 0; //variável precisa ser declarada
        while (x != 0){ //Testa se o num digitado é V ou F
            soma = soma + x; // ou soma += x;
            x = sc.nextInt(); //Se V, digitar o próximo num que será verificado
        }
        System.out.println(soma); //Se F, sai da estrutura de repetição
        sc.close();
    }
}
