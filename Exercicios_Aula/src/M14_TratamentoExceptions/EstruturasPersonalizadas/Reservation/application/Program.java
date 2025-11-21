package M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next()); //NOTE: recebe a data em format text e sdf converte para date
        //NOTE: metodo parse gera uma parse exception, como o tratamento da exception ainda não será feito,
        //usa-se a autocorreção (throws ParseException) para propagar a exception sem tratar (try catch)

        sc.close();

    }
}
