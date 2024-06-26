import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double xA, xB, xC, yA, yB, yC;


        System.out.printf("Enter the measures of triangle X:%n");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.printf("Enter the measures of triangle Y:%n");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();


        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA ) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA ) * (p - yB) * (p - yC));


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
