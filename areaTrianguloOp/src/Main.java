import entities.Triangle;

import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Triangle x,y;
        x = new Triangle();
        y = new Triangle();


        System.out.printf("Enter the measures of triangle X:%n");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("Enter the measures of triangle Y:%n");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); // x é o objeto
        double areaY = y.area(); // y é o objeto


        System.out.printf("Triangle X area : %.4f%n", areaX);
        System.out.printf("Triangle Y area : %.4f%n", areaY);


        if (areaX > areaY){
            System.out.print("Larger area: X");
        }

        else{
            System.out.print("Larger area: Y");
        }


        sc.close();





    }
}
