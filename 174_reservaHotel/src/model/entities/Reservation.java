package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;


    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation(){

    }

    public Reservation (Integer roomNumber, Date checkIn, Date checkOut){
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

   public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
   }

   public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
   }


   @Override
   public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Room: " + getRoomNumber() + ", \n");
        sb.append("Check-in: " + sdf.format(checkIn) + ", \n");
        sb.append("Check-out: " + sdf.format(checkOut) + ", \n");
        sb.append(duration() + "nights ! ");
        return sb.toString();
   }
}
