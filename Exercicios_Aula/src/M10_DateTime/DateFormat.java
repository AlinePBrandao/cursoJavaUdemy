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
        Date x3 = new Date(0L); //informa qtd milisegundos
        //valor 0L se refere a 01/01/1970 00:00, mas no horário do BR (-3:00) 31/12/1969 21:00:00
        Date x4 = new Date(1000L * 60L * 60L * 5L); //calcula 5 horas, minuto, hora, 5 horas

        Date y1 = sdf1.parse("08/07/2025"); //converte a data respeitando a formatação
        Date y2 = sdf2.parse("08/07/2025 17:27:45");

        //formato padrão Tue Jul 08 17:27:45 BRT 2025
        System.out.println("y1 basic form: " + y1);
        System.out.println("y2 basic form: " + y2);
        System.out.println();

        //Formato com hora, min e seg
        System.out.println("x1: " +sdf2.format(x1));
        System.out.println("x2: " +sdf2.format(x2));
        System.out.println("x3: " +sdf2.format(x3));
        System.out.println("x4: " +sdf2.format(x4));
        System.out.println();
        System.out.println("y1 formatter: " +sdf2.format(y1));
        System.out.println("y2 formatter: " +sdf2.format(y2));
    }
}
