import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);


        System.out.printf("%n");

        int mask = 32;
        int n = sc.nextInt();

        if ((n & mask) != 0 ) { /** n & bit a bit com a  mask diferente de 0 **/
            System.out.print("6th bit is true !");
        }

        else{
            System.out.print("6th bit is false ! ");
        }







    }
}
