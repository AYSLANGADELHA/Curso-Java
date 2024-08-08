import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;




public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            System.out.println("Product " + i + "º data:");
            System.out.print("Common, used or imported (c/u/i): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();


            if (ch == 'c'){
                list.add(new Product(name, price));
            }

            else if (ch == 'u'){
                System.out.print("Date of manufacture: ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }

            else{
                System.out.print("Import tax: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAG: ");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}