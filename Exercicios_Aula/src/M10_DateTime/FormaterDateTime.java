package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormaterDateTime {
    public static void main(String[] args) {

        //Converter data-hora p/ texto
        LocalDate d01 = LocalDate.parse("2025-07-04");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-04T01:30:26");
        Instant d03 = Instant.parse("2025-07-04T01:30:26Z"); //data ambigua dependendo do fuso

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //estabelece zona + fuso do computador

        System.out.println("d01 = " + d01.format(fmt1)); //respeita formato estabelecido
        System.out.println("d02 = " + d02.format(fmt2)); //respeita formato com hora
        System.out.println("d03 = " + fmt3.format(d03)); //considerando horario sistema local a partir do fuso estabelecido (nesse caso -3:00)



        //System.out.println("d01 = " + fmt1.format(d01)); //imprimindo a partir dele
        //System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //Instanciação direta, sem reaproveitamento
    }
}
