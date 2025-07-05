package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculateTimeAndDuration {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-07-04");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-04T01:30:26");
        Instant d03 = Instant.parse("2025-07-04T01:30:26Z");

        // Acrescentar ou Subtrair Tempo
        LocalDate pastWeekLocalDate = d01.minusDays(7); //Subtrai dias
        LocalDate nextWeekLocalDate = d01.plusDays(7); //Acrescenta dias

        System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);


        //Duração

    }
}
