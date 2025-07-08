package M10_DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException { //tratamento de exceção  para o parse

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("08/07/2025"); //converte a data respeotando a formatação
        Date y2 = sdf2.parse("08/07/2025 17:27:45");

        System.out.println(y1);
        System.out.println(y2);
    }
}
