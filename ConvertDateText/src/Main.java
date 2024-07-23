import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/10/docs/api/java/util/Date.html


        LocalDate data04 = LocalDate.parse("2024-07-20");
        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("data04 = " + data04.format(formato01));
        System.out.println("data04 = " + formato01.format(data04));
        System.out.println("data04 = " + data04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));



        //formatando LocalDateTime

        LocalDateTime data05 = LocalDateTime.parse("2024-07-20T01:30:26");
        DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("data05 = " + data05.format(formato02));


        //imprimindo Instant de forma customizada(Instant não tem o método format)


        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");
        DateTimeFormatter formato03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("data06 = " + formato03.format(data06));






        LocalDate data10 = LocalDate.parse("2024-07-20");
        LocalDateTime data11 = LocalDateTime.parse("2024-07-20T01:30:26");

        System.out.println("data10 dia = " + data10.getDayOfMonth());
        System.out.println("data10 mês = " + data10.getMonthValue());
        System.out.println("data10 ano = " + data10.getYear());


        System.out.println("data11 hora = " + data11.getHour());
        System.out.println("data11 minutos = " + data11.getMinute());
        System.out.println("data11 segundos = " + data11.getSecond());


    }
}
