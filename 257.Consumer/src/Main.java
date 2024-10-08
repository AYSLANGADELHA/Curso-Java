import entities.Product;
import util.PriceUpdate;

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

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);

        //list.forEach(Product::staticPriceUpdate); referenciando o método estático da classe
        //list.forEach(Product::nonStaticPriceUpdate); referenciando o método não estático da classe

        /*

        - Expressão lambda declarada


        Consumer<Procut> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(cons);


        - Expressão lambda não declarada(inline)

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        */








    }
}
