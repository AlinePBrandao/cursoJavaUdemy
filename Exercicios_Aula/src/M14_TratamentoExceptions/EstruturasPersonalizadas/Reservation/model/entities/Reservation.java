package M14_TratamentoExceptions.EstruturasPersonalizadas.Reservation.model.entities;

import java.util.Date;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }

    //NOTE: checkin e checkout sem set porque as datas não podem ser alteradas arbitrariamente



}
