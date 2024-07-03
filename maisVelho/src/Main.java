import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people you're going to type in: ");
        int n = sc.nextInt();

        String[] vectName = new String[n];
        int[] vectAge = new int[n];


        for (int i=0; i<n; i++){
            System.out.printf("Data %dª people: \n", i+1);
            System.out.print("Name: ");
            vectName[i] = sc.next();

            System.out.print("Age: ");
            vectAge[i] = sc.nextInt();
        }



        int ageMajority, posiMajority ;

        ageMajority = vectAge[0];
        posiMajority = 0;


        for (int i=0; i<n; i++){
            if (vectAge[i] > ageMajority ){
                ageMajority = vectAge[i];
                posiMajority = i;
            }
        }

        System.out.printf("OLDER PERSON: " + vectName[posiMajority]);











        sc.close();
    }
}
