package M10_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDTGlobalToLocal {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-07-04");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-04T01:30:26");
        Instant d03 = Instant.parse("2025-07-04T01:30:26Z");

        //Converter data global p/ local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); //converte instante p/ LocalDate com base na timezone do sistema
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); //converte instante p/ LocalDate com base na timezone específica
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault()); //converte para horário local do sistema (-3:00 BR)
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal")); //converte para horário de fuso estabelecido

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);



        //Retorna coleção com nomes dos fusos customizados
//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
    }
}
