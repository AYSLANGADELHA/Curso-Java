import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /**

         Fazer um programa para ler um número inteiro
         e dizer se este número é par ou ímpar.
         **/

        Scanner sc = new Scanner(System.in);

        int User;

        System.out.print("Digite um número qualquer, para saber se ele é impar ou par: ");
        User = sc.nextInt();

        if (User % 2 == 0) {

            System.out.printf("O número %d é PAR ", User);
        } else {
            System.out.printf("O número %d é IMPAR ", User);
        }

    }
}