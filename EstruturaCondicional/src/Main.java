
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);


        /** int x = 5;

         System.out.println("Bom dia ! " );

         if (x > 0) if(x < 0) {
         System.out.println("BOA TARDE ! " );

         }

         else {
         System.out.print("Você acertou ! ");

         }**/
        /**
         Scanner sc = new Scanner (System.in);
         int Hour;

         System.out.print("Quantas horas: ");
         Hour = sc.nextInt();

         if (Hour >= 10){
         System.out.println("A hora é maior que 10");
         }

         else{

         System.out.println("A hora não é maior que 10");
         }**/


        Scanner sc = new Scanner(System.in);
        int Hour;

        System.out.print("Que horas são: ");
        Hour = sc.nextInt();

        if (Hour < 12) {
            System.out.print("Bom dia !");
        } else if (Hour < 18) {
            System.out.print("Boa Tarde ! ");
        } else {
            System.out.print("Boa Noite ! ");
        }


    }
}
