import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        /** DEMONSTRAÇÃO **/

        double Price = 34.5;
        double Discount;
        if (Price < 20.0) {
            Discount = Price * 0.1;
        }
        else{
            Discount = Price * 0.05;
        }

        System.out.printf("O desconto total do produto é de R$ %.2f reais%n",Discount);






        double Price1 = 34.5;
        double Discount1 = (Price1 < 20.0)? Price1 * 0.1 : Price1 * 0.05;
        System.out.printf("O desconto total do produto 'Price1' é de R$ %.2f reais", Discount1);
    }
}

