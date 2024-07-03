import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will there be vector:  ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Enter the number: ");
            vect[i] = sc.nextInt();
        }


        int sumPair = 0;
        int quantPar = 0;

        for (int i=0; i<n; i++){
            if(vect[i] % 2 ==0){
                sumPair = sumPair + vect[i];
                quantPar++;
            }
        }

       if (quantPar == 0){
           System.out.println("NO EVEN NUMBER");
       }

       else{
           double average = 0;
           average = ((double)sumPair / quantPar);

           System.out.printf("AVERAGE THE PAIRS = %.1f", average);
       }

















        sc.close();
    }
}