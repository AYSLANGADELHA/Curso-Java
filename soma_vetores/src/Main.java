import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        /*

        Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida:
                    - imprimir todos os elementos do vetor
                    - mostrar na tela a soma e a média dos elementos do vetor

         */

        double sum, average;

        System.out.print("How many numbers will you enter: ");
        int n = sc.nextInt();

        double[] vect = new double [n];

        for (int i=0; i<n; i++){
            System.out.print("Enter the number: ");
            vect[i] = sc.nextDouble();
        }

        // soma

            sum = 0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        average = sum / n;

            System.out.print("VALORES = ");
        for (int i=0; i<n; i++){
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.printf("\nSUM = %.2f\n", sum);
        System.out.printf("AVERAGE = %.2f\n", average);


















        sc.close();

    }
}
