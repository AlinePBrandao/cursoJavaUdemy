package M10_DateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarManipulate {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2025-07-09T12:17:15Z")); //imprime com horário local -3:00
        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance(); //Acrescentar tempo
        cal.setTime(d); //data instanciada
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime(); //atualiza a data

        System.out.println(sdf.format(d));

    }
}
