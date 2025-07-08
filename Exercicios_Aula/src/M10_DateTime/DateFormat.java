package M10_DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException { //tratamento de exceção  para o parse

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x1 = new Date(); //data com instante atual
        Date x2 = new Date(System.currentTimeMillis()); //converte um instante do sistema para milisegundos e cria a data

        Date y1 = sdf1.parse("08/07/2025"); //converte a data respeitando a formatação
        Date y2 = sdf2.parse("08/07/2025 17:27:45");

        //formato padrão Tue Jul 08 17:27:45 BRT 2025
        System.out.println("y1 basic form: " + y1);
        System.out.println("y2 basic form: " + y2);
        System.out.println();

        //Formato com hora, min e seg
        System.out.println("x1: " +sdf2.format(x1));
        System.out.println("x2: " +sdf2.format(x2));
        System.out.println();
        System.out.println("y1 formatter: " +sdf2.format(y1));
        System.out.println("y2 formatter: " +sdf2.format(y2));
    }
}
