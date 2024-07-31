import entitie.Order;
import entities.enums.OrderStatus;

import java.util.Date;

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

    // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);


        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);






    }
}
