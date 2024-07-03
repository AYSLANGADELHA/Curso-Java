import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type: ");
        int n = sc.nextInt();


        int[] vect = new int [n];

        for (int i = 0; i<n; i++){

            System.out.printf("Enter %dº number: ", i+1);
            vect[i] = sc.nextInt();

        }


        System.out.print("NUMBERS PAIRS: ");

        int quantPair = 0;

        for (int i=0; i<n; i++){
            if(vect[i] % 2 == 0){
                System.out.printf("%d  ", vect[i]);
                quantPair += 1;
            }
        }



        System.out.printf("%nQUANTITY PAIR = %d", quantPair);


        sc.close();




    }
}
