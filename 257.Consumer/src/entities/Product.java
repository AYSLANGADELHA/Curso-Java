package entities;

public class Product {

    private String name;
    private Double price;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /*

    MÉTODO ESTÁTICO

    public static void staticPriceUpdate(Product p){
       p.setPrice(p.getPrice() * 1.1);

    MÉTODO NÃO ESTÁTICO

    public static void nonStaticPriceUpdate(){
       price = price * 1.1;


     */

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);

    }
}


