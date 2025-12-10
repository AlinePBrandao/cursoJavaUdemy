package M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.application;

import M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next()); //NOTE: recebe a data em format text e sdf converte para date

            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            //NOTE: essa validação precisa ser no constructor

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            //NOTE: caso de erro
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        //Tratamento de exceptions e parse exceptions no catch
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }

        sc.close();
    }
}
