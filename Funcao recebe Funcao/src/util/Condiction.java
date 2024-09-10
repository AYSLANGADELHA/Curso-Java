package util;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class Condiction {

    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for(Product p : list){
            if(criteria.test(p)){
                sum+=p.getPrice();
            }
        }
        return sum;
    }
}
