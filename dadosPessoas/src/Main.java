import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed: ");
        int n = sc.nextInt();

        double minor, average, bigger;
        int man;


        double[] height = new double[n];
        char[] gender = new char[n];

        for(int i=0; i<n; i++){
            System.out.printf("Height %dª people: ", n);
            height[i] = sc.nextDouble();
            System.out.printf("Gender %d people: ", n);
            gender[i] = sc.next().charAt(0);
        }


        minor = height[0];
        bigger = height[0];

        for  (int i=0; i<n; i++){
            if (height[i] > bigger){
                bigger = height[i];
            }

            if(height[i] < minor){
                minor = height[i];
            }
        }

        int quantMan, quantFemale;
        double heightFemaleTotal;

        quantMan = 0;
        quantFemale = 0;
        heightFemaleTotal = 0;

        for (int i=0; i<n; i++){
            if (gender[i] == 'M'){
                quantMan++;
            }

            else{
                quantFemale++;
                heightFemaleTotal = heightFemaleTotal + height[i];
            }
        }

        heightFemaleTotal = heightFemaleTotal / quantFemale;

        System.out.printf("BIGGER AGE: %.2f \n", bigger);
        System.out.printf("MINOR AGE: %.2f \n", minor);

        System.out.printf("AVERAGE HEIGHT FEMALE: %.2f \n", heightFemaleTotal);
        System.out.printf("NUMBER MAN: %d ", quantMan);













        sc.close();

    }
}


