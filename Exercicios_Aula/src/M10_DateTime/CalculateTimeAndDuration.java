package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateTimeAndDuration {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-07-04");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-04T01:30:26");
        Instant d03 = Instant.parse("2025-07-04T01:30:26Z");

        // Acrescentar ou Subtrair Tempo
        LocalDate pastWeekLocalDate = d01.minusDays(7); //Subtrai dias
        LocalDate nextWeekLocalDate = d01.plusDays(7); //Acrescenta dias
        LocalDate nextYearLocalDate = d01.plusYears(7); //Acrescenta anos

        System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("NextYearLocalDate = " + nextYearLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7); //Subtrai dias
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7); //Acrescenta dias
        LocalDateTime nextHourLocalDateTime = d02.plusHours(10); //Acrescenta horas

        System.out.println("PastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("NextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("NextHourLocalDateTime = " + nextHourLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS); //Subtrai dias
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS); //Acrescenta dias
        Instant nextHourInstant = d03.plus(7, ChronoUnit.HOURS); //Acrescenta horas

        System.out.println("PastWeekInstant = " + pastWeekInstant);
        System.out.println("NextWeekInstant = " + nextWeekInstant);
        System.out.println("NextHourInstant = " + nextHourInstant);

        //Duração

    }
}
