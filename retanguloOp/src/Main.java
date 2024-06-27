import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;
public class Main {
    public static void main(String[] args) {


        double Area, Diagonal, Perimeter;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.print("WIDTH: ");
        retangulo.Width = sc.nextDouble();

        System.out.print("Height: ");
        retangulo.Height = sc.nextDouble();


        Area = retangulo.Area();
        Perimeter = retangulo.Perimeter();
        Diagonal = retangulo.Diagonal();

        System.out.println("AREA: " + Area);
        System.out.println("PERIMETER: " + Perimeter);
        System.out.println("Diagonal: " + Diagonal);

        System.out.println(retangulo);


    }
}
