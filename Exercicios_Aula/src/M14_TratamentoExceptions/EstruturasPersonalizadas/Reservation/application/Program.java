package M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.application;

import M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.model.entities.Reservation;

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
        Date checkIn = sdf.parse(sc.next()); //NOTE: recebe a data em format text e sdf converte para date
        //NOTE: metodo parse gera uma parse exception, como o tratamento da exception ainda não será feito,
        //usa-se a autocorreção (throws ParseException) para propagar a exception sem tratar (try catch)

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (! checkOut.after(checkIn)){ //NOTE: data de check-out antes que check-in
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            //NOTE: leu as nhovas datas e atualiza
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }

        sc.close();

    }
}
