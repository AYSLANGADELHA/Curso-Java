import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        LocalDate data10 = LocalDate.parse("2024-07-20");
        LocalDateTime data11 = LocalDateTime.parse("2024-07-20T01:30:26");

        System.out.println("data10 dia = " + data10.getDayOfMonth());
        System.out.println("data10 mês = " + data10.getMonthValue());
        System.out.println("data10 ano = " + data10.getYear());


        System.out.println("data11 hora = " + data11.getHour());
        System.out.println("data11 minutos = " + data11.getMinute());
        System.out.println("data11 segundos = " + data11.getSecond());

        System.out.println("----------------------------------------------------------");
        System.out.println();




        // minus e plus

        LocalDate data04 = LocalDate.parse("2022-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");





        //LocalDate
        LocalDate pastWeekLocalDate = data04.minusDays(7);
        LocalDate nextWeekLocalDate = data04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println();
        System.out.println("----------------------------------------------------------");


        // LocalDateTime
        LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println();
        System.out.println("----------------------------------------------------------");



        //Instant
        Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);








    }
}
