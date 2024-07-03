import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be entered: ");
        int n = sc.nextInt();
        double average;

        String[] name = new String[n];
        double[] vect1 = new double[n];
        double[] vect2 = new double[n];


        for(int i=0; i<n; i++){

            System.out.println("Enter name, 1ª and 2ª student's note ");
            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();

                System.out.print("1ª NOTE: ");
                vect1[i] = sc.nextDouble();
                    System.out.print("2ª NOTE: ");
                    vect2[i] = sc.nextDouble();

        }

        System.out.println("STUDENTS APPROVED: ");


        for(int i=0; i<n; i++){
            average = (vect1[i] + vect2[i]) / 2;
            if(average >= 6){
                System.out.printf("%s\n", name[i]);
            }
        }















        sc.close();
    }
}
