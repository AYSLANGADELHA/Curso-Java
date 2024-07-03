import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type: ");
        int n = sc.nextInt();

        int[] vect = new int [n];

        for(int i=0; i<n; i++){
            System.out.print("Enter number: ");
            vect[i] = sc.nextInt();

        }


        double bigger = vect[0];
        int highPosition = 0;


        for (int i=1; i<n; i++){
            if (vect[i] > bigger){
                bigger = vect[i];
                highPosition = i;
            }
        }

        System.out.println("HIGHER VALUE: " + bigger);
        System.out.print("POSITION HIGHER VALUE: " + highPosition);






    }
}
