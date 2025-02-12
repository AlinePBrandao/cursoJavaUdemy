package M3_EstruturasCondicionais.Exercicios;

import java.util.Scanner;

public class duracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário de início do jogo: ");
        int horaIn = sc.nextInt();
        System.out.println("Digite o horário de fim do jogo: ");
        int horaFim = sc.nextInt();
        int duracao;

        if (horaIn < horaFim){
            duracao = horaFim - horaIn;
        }
        else{
            duracao = 24 - horaIn + horaFim;
        }
        System.out.println("Duração total do jogo: " + duracao + " Hora(s)");

        sc.close();
    }
}
