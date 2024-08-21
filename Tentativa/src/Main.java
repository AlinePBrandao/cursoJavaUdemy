import java.util.Scanner;

public class CalculoDuracaoJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura da hora inicial
        System.out.print("Digite a hora inicial (no formato hh:mm): ");
        String horaInicialStr = sc.next();

        // Leitura da hora final
        System.out.print("Digite a hora final (no formato hh:mm): ");
        String horaFinalStr = sc.next();

        // Extrair as horas e minutos da hora inicial
        int horaInicial = Integer.parseInt(horaInicialStr.substring(0, 2));
        int minutoInicial = Integer.parseInt(horaInicialStr.substring(3, 5));

        // Extrair as horas e minutos da hora final
        int horaFinal = Integer.parseInt(horaFinalStr.substring(0, 2));
        int minutoFinal = Integer.parseInt(horaFinalStr.substring(3, 5));

        // Calcular a diferença em minutos entre a hora final e a hora inicial
        int difHoras, difMinutos;
        if (horaFinal >= horaInicial) {
            difHoras = horaFinal - horaInicial;
            difMinutos = minutoFinal - minutoInicial;
        } else {
            difHoras = 24 - horaInicial + horaFinal;
            difMinutos = minutoFinal - minutoInicial;
        }

        // Calcular a duração total em minutos
        int duracaoTotalMinutos = difHoras * 60 + difMinutos;

        // Verificar se a duração é válida (mínimo 1 minuto, máximo 24 horas)
        if (duracaoTotalMinutos < 1) {
            duracaoTotalMinutos += 24 * 60; // Ajuste para casos onde a diferença foi negativa
        } else if (duracaoTotalMinutos > 24 * 60) {
            duracaoTotalMinutos = 24 * 60; // Limite máximo de 24 horas
        }

        // Calcular horas e minutos da duração total
        int duracaoHoras = duracaoTotalMinutos / 60;
        int duracaoMinutos = duracaoTotalMinutos % 60;

        // Exibir a duração do jogo
        System.out.println("A duração do jogo é de " + duracaoHoras + " horas e " + duracaoMinutos + " minutos.");

        sc.close();
    }
}