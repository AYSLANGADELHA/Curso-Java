import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // expressão lambda declarada
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //list.removeIf(pred);


        // expressão lambda inline
        list.removeIf(p -> p.getPrice() >= 100.0);




        for (Product p : list) {
            System.out.println(p);
        }
    }
}
