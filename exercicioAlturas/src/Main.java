import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed: ");
        int n = sc.nextInt();

        String[] vectName = new String[n];
        int[] vectAge = new int[n];
        double[] vectHeight = new double[n];



        for (int i=0; i<n; i++){
            System.out.printf("%dª person data: %n", i+1);

            System.out.print("NAME: ");
            vectName[i] = sc.next();


            System.out.print("AGE: ");
            vectAge[i] = sc.nextInt();

            System.out.print("HEIGHT: ");
            vectHeight[i] = sc.nextDouble();

        }

            int nMinor = 0;
            double heightTotal = 0;

            for (int i=0; i<n; i++){
                if (vectAge[i] < 16){
                    nMinor ++;
                }


                heightTotal = heightTotal + vectHeight[i];
            }


            // percentage < 16 and average heights

            double heightAverage, percentageMinor;


            heightAverage = heightTotal / n;
            percentageMinor = ((double)nMinor / n ) * 100.0;


            System.out.printf("HEIGHT AVERAGE = %.2fm%n",heightAverage);
            System.out.printf("PERSONS UNDER 16 YEARS OF AGE: %.1f%%\n", percentageMinor);


            for (int i=0; i<n; i++){
                if (vectAge[i] < 16){
                    System.out.printf("- %s\n", vectName[i]);
                }
            }







    }
}
