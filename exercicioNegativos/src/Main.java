import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    /*

    Faça um programa que leia um número inteiro positivo
    N(máximo=10) e depois N números inteiros e armazene-os
    em um vetor.
    Em seguida, mostrar na tela todos números negativos lidos.

     */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers will you enter: ");
        n = sc.nextInt();
        int[] vect = new int [n];

        for (int i=0; i<vect.length; i++){
            System.out.print("Enter number: ");
            vect[i] = sc.nextInt();

        }

        System.out.println("NUMBERS NEGATIVE: ");

        for (int i=0; i<vect.length; i++){
            if (vect[i] < 0){
                System.out.printf("%d%n", vect[i]);
            }
        }






















        sc.close();
    }
}
