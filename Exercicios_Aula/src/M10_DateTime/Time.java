package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Padrão estabelecido de data para d08
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //Padrão estabelecido de data para d08

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); //Fuso de Londres + 3:00

        //Texto para data-hora
        LocalDate d04 = LocalDate.parse("2025-07-04"); //padrão ISO
        LocalDateTime d05 = LocalDateTime.parse("2025-07-04T01:30:26");
        Instant d06 = Instant.parse("2025-07-04T01:30:26Z"); //para fuso de Londres
        Instant d07 = Instant.parse("2025-07-04T01:30:26-03:00"); //para fuso convertido

        //Texto formato customizado - data-hora
        LocalDate d08 = LocalDate.parse("04/07/2025", fmt1); //passa a data p/ formato ISO
        LocalDateTime d09 = LocalDateTime.parse("04/07/2025 01:30", fmt2); //data e hora formato ISO

        System.out.println("d01 = " + d01.toString()); //o toString por padrão gera o formato ISO
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
    }
}
