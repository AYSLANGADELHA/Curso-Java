import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // instanciando DateTimeFormater apartir de um padrão "Pattern"

        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");






        //instanciando apartir do agora com LocalDate, LocalDateTime e Instant

        LocalDate data01 = LocalDate.now();
        System.out.println("data01 = " + data01);


        LocalDateTime data02 = LocalDateTime.now();
        System.out.println("data02 = " + data02);


        Instant data03 = Instant.now();
        System.out.println("data03 = " + data03);


        // texto ISO 8601

        LocalDate data04 = LocalDate.parse("2022-07-20");
        System.out.println("data04 = " + data04.format(formato01));


        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:36");
        System.out.println("data05 = " + data05);


        Instant data06 = Instant.parse("2022-07-20T01:30:36Z");
        System.out.println("data06 = " + data06);

        // fuso de SP "-03:00"
        Instant data07 = Instant.parse("2022-07-20T01:30:36-03:00");
        System.out.println("data07 = " + data07);


        // texto formato customizado - Data-hora
        LocalDate data08 = LocalDate.parse("20/07/2022", formato01);
        System.out.println("data08 = " + data08);

        LocalDateTime data09 = LocalDateTime.parse("20/07/2022 01:30", formato02);
        System.out.println("data09 = " + data09);



        // "of" aceita ano, mês, dia nessa ordem
        LocalDate data10 = LocalDate.of(2022, 7, 20);
        System.out.println("data10 = " + data10);

        LocalDateTime data11 = LocalDateTime.of(2024, 7, 17, 18, 37);
        System.out.println("data11 = " + data11);


    }
}
