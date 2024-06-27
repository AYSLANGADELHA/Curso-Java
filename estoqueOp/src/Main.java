import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: "); // adicionando nome ao objeto
        product.name = sc.nextLine();

        System.out.print("Price R$  ");
        product.price = sc.nextDouble(); // adicionando o preço ao objeto

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt(); // adicionando quantidade ao objeto

        System.out.println();
        System.out.println("Product data: " + product) ;
        // System.out.println(product.totalValueInStock());


        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.print("Update data: " + product); // produtos adicionados


        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);













        sc.close();
    }
}