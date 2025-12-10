package M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //NOTE: dado estático pra que não seja instanciado novo sdt p cada obj Reservation da aplicação, será necessário apenas 1

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    //NOTE: checkin e checkout sem set porque as datas não podem ser alteradas arbitrariamente

    //NOTE: long para facilitar no retorno de valor (tempo) que será longo
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); //NOTE: diferença entre as datas em milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //NOTE: convertendo milissegundos para dias
    }

    //Recebe datas novas e atualiza checkin e checkout
    public void updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
        //NOTE: metodo não retornará uma String com mensagem de erro, e sim lançar uma exception caso ela ocorra
        //NOTE: regra de validação: data de checkOut não pode ser anterior a checkIn
        if (checkIn.before(now) || checkOut.before(now)) {
           throw new IllegalArgumentException("Reservation dates for update must be future dates");
        }
        else if (!checkOut.after(checkIn)){ //NOTE: data de checkOut não for posterior a check-in
            throw new IllegalArgumentException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
                + ", " + duration() + " nights";
    }
}
