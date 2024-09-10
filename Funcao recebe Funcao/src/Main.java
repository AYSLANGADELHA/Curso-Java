import entities.Product;
import util.Condiction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Condiction cs = new Condiction();
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double sum = cs.filteredSum(list, p -> p.getPrice() < 100.0);
        System.out.println(sum);

        double filterNamePerPrice = cs.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println(filterNamePerPrice);
    }
}