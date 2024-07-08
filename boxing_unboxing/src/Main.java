import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //BOXING
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        // UNBOXING
        int y =  (int) obj;

        System.out.println(y);









    }
}
