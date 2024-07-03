import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("How many elements will the vector have: ");
        int n = sc.nextInt();
        double average;

        double[] vect = new double[n];

        double sumVect = 0;
        for (int i=0; i<n; i++){
            System.out.print("Enter number: ");
            vect[i] = sc.nextDouble();
            sumVect = sumVect + vect[i];
        }

        average = sumVect/n;

        System.out.println("AVERAGE THE VECTOR = " + average);

        System.out.println("BELOW AVERAGE ELEMENTS: ");
        for (int i=0; i<n; i++){
            if(vect[i] < average){
                System.out.printf("%.1f\n", vect[i]);
            }
        }



















        sc.close();
    }
}
