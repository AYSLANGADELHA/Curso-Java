import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Instant;
import java.util.TimeZone;






public class Main {
    public static void main(String[] args) throws ParseException {
        // formatos
        SimpleDateFormat simpleDateFormat01 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat simpleDateFormat03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        simpleDateFormat03.setTimeZone(TimeZone.getTimeZone("GMT"));

        // formas de instanciar data atual
        Date atual01 = new Date();
        Date atual02 = new Date(System.currentTimeMillis());
        Date atual03 = new Date(0L);
        Date atual04 = new Date(1000L * 60L * 60L * 5L);


        // passando modelos/parâmetros
        Date date01 = simpleDateFormat01.parse("25/06/2018");
        Date date02 = simpleDateFormat02.parse("25/06/2018 15:42:07");
        Date date03 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));


        //impressões
        // time zone UTC
        System.out.println("    TIME ZONE UTC/BRASIL    ");
        System.out.println();
        System.out.println("data01 = " + simpleDateFormat01.format(date01));
        System.out.println("data02 = " + simpleDateFormat02.format(date02));
        System.out.println("data03 = " + simpleDateFormat02.format(date03));

        System.out.println();

        System.out.println("atual01 = " + simpleDateFormat02.format(atual01));
        System.out.println("atual02 = " + simpleDateFormat02.format(atual02));
        System.out.println("atual03 = " + simpleDateFormat02.format(atual03));
        System.out.println("atual04 = " + simpleDateFormat02.format(atual04));
        System.out.println();
        System.out.println("<------------------------------------------------->");
        System.out.println();


        // time zone GTM
        System.out.println("        TIME ZONE GMT       ");
        System.out.println();
        System.out.println("data01 = " + simpleDateFormat03.format(date01));
        System.out.println("data02 = " + simpleDateFormat03.format(date02));
        System.out.println("data03 = " + simpleDateFormat03.format(date03));

        System.out.println();

        System.out.println("atual01 = " + simpleDateFormat03.format(atual01));
        System.out.println("atual02 = " + simpleDateFormat03.format(atual02));
        System.out.println("atual03 = " + simpleDateFormat03.format(atual03));
        System.out.println("atual04 = " + simpleDateFormat03.format(atual04));





        // sem formato de time zone
        System.out.println("<------------------------------------------------->");
        System.out.println();
        System.out.println("        SEM FORMATO     ");
        System.out.println();

        System.out.println("data01 = " + (date01));
        System.out.println("data02 = " + (date02));
        System.out.println("data03 = " + (date03));

        System.out.println();

        System.out.println("atual01 = " + (atual01));
        System.out.println("atual02 = " + (atual02));
        System.out.println("atual03 = " + (atual03));
        System.out.println("atual04 = " + (atual04));





    }
}
