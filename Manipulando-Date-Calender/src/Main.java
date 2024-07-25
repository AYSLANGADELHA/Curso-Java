import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.time.Instant;


public class Main {
    public static void main(String[] args) throws ParseException {



        SimpleDateFormat SimpDatForm = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(SimpDatForm.format(d));


        // somando uma unidade de tempo

        Calendar cal01 = Calendar.getInstance();
        cal01.setTime(d);
        cal01.add(Calendar.HOUR_OF_DAY, 4);
        d = cal01.getTime();

        System.out.println(SimpDatForm.format(d));


        // obtendo uma unidade de tempo

        Calendar cal02 = Calendar.getInstance();
        cal02.setTime(d);
        int minutes = cal02.get(Calendar.MINUTE);
        int month = 1 + cal02.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
























    }
}
