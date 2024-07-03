import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values each vector will have: ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Enter value vect A: ");
        for (int i=0; i<n; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Enter value vect B: ");
        for (int i=0; i<n; i++){
            vectB[i] = sc.nextInt();
        }


        // Soma de vetores
        for (int i=0; i<n; i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor resultante: ");

        for(int i=0; i<n; i++){
            System.out.printf("%d\n", vectC[i]);
        }

        sc.close();













    }
}