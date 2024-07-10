import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    /*

    Fazer um programa para ler um número inteiro N
    e uma matriz de ordem N contendo números inteiros.
    Em seguida, mostrar a diagonal principal e a quantidade
    de valores negativos da matriz.

     */



        int n = sc.nextInt();

        // arranjo bidimencional
        int [][] mat = new int[n][n];


        for (int i=0;  i<n; i++){
            for (int j=0; j<n; j++){
                mat [i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i<n; i++){
            System.out.print(mat [i][i] + " ");
        }
        System.out.println();


        int countNegative = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] < 0){
                    countNegative++;
                }
            }
        }

        System.out.println("Negative numbers = " + countNegative);


        sc.close();
    }
}
