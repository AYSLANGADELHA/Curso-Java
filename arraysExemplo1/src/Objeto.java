import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Objeto {
    public static void main(String[] args) {

        /*

        Fazer um programa para ler um número inteiro N
        e os dados (nome e preço) de N produtos.
        Armazene os N produtos em um vetor. Em seguida
        mostrar o preço médio dos produtos.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times will it be repeated: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++){

            System.out.print("Enter name product: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter price product: $ ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);

        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", average);










        sc.close();
    }

}
