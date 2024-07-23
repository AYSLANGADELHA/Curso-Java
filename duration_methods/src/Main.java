import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        //atTime() - usado para passar parâmetros de diferença
        //atStartOfDay() - usado automaticamente com a hora do inicio do dia


        LocalDate data04 = LocalDate.parse("2022-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");

        // DURATION com LocalDate
        LocalDate pastWeekLocalDate = data04.minusDays(7);
        LocalDate nextWeekLocalDate = data04.plusDays(7);
        Duration teste01 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay());
        System.out.println("teste01 dias = " + teste01.toDays());
        System.out.println("--------------------------------------------------");
        System.out.println();



        // DURATION com LocalDateTime

        LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);
        Duration teste02 = Duration.between(pastWeekLocalDateTime, data05);
        System.out.println("teste02 dias = " + teste02.toDays());
        System.out.println("--------------------------------------------------");
        System.out.println();



        // DURATION com LocalDateTime



        Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);
        Duration teste03 = Duration.between(pastWeekInstant, data06);
        System.out.println("teste03 dias = " + teste03.toDays());

        // ou

        Duration teste04 = Duration.between(data06, pastWeekInstant);
        System.out.println("teste04 = " + teste04.toDays());




    }
}
