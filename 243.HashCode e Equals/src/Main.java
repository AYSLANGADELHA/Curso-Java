import entities.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        //EQUALS
        String a = "Maria";
        String b = "Maria";
        String c = "Alex";
        System.out.println(a.equals(c));

        System.out.println("----------------------------");

        // HashCode

        String x = "Maria";
        String y = "Alex";

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());


         */

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Text";
        String s2 = "Text";


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);



    }
}