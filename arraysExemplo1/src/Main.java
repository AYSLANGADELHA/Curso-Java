import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




    /*

    Fazer um programa para ler um número inteiro N
    e a altura de N pessoas. Armazene as N alturas
    em um vetor. Em seguida, mostrar a altura média
    dessas pessoas.

     */


        System.out.print("Enter number for to read three height: ");
        int n = sc.nextInt();
        double[] vect = new double [n];

        for (int i=0; i<n; i++){
            System.out.println("Enter heights: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i ++){
            sum += vect[i];

        }

        double average = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", average);



        sc.close();
    }

}
