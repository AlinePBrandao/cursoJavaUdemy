package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormaterDateTime {
    public static void main(String[] args) {

        //Converter data-hora p/ texto
        LocalDate d01 = LocalDate.parse("2025-07-04");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d01 = " + d01.format(fmt1)); //respeita formato estabelecido
        System.out.println("d01 = " + fmt1.format(d01)); //imprimindo a partir dele
    }
}
