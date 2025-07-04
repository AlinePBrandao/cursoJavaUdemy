package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Time {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); //Fuso de Londres + 3:00

        //Texxto para data-hora
        LocalDate d04 = LocalDate.parse("2025-07-04"); //padrão ISO
        LocalDateTime d05 = LocalDateTime.parse("2025-07-04T01:30:26");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
    }
}
