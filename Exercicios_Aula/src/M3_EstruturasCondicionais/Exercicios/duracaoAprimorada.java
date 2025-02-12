package M3_EstruturasCondicionais.Exercicios;

import java.time.LocalTime; //Classe para representar um horário específico do dia.
import java.time.format.DateTimeFormatter; //Para formatar e analisar datas e horas.
import java.time.temporal.ChronoUnit; //Enumeração que define as unidades de tempo suportadas para cálculos de datas e horas.
import java.util.Scanner;

public class duracaoAprimorada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Formato esperado de entrada e saída
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Digite o horário de início (no formato HH:mm): ");
        String horarioInicioStr = sc.next();

        System.out.println("Digite o horário de finalização (no formato HH:mm): ");
        String horarioFinalStr = sc.next();

        // Converter strings para LocalTime
        LocalTime horaInicio = LocalTime.parse(horarioInicioStr, formato);
        LocalTime horaFinal = LocalTime.parse(horarioFinalStr, formato);

        // Calcular a diferença em minutos
        long diferencaMinutos;
        if (horaInicio.isBefore(horaFinal)) {
            diferencaMinutos = ChronoUnit.MINUTES.between(horaInicio, horaFinal);
        } else {
            diferencaMinutos = ChronoUnit.MINUTES.between(horaInicio, horaFinal.plusHours(24));
        }

        // Exibir resultado no formato HH:mm
        long horas = diferencaMinutos / 60;
        long minutos = diferencaMinutos % 60;
        System.out.println("Duração total do jogo: " + String.format("%02d:%02d", horas, minutos));

        sc.close();
    }
}
