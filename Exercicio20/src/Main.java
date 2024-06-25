import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

        /**

         Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
         Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
         Apresente a média ponderada para cada um destes conjuntos de 3 valores
         sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
         peso 5.

         **/
        System.out.print("Quantas vezes vai se repetir: ");
        int x = sc.nextInt();

        for (int i = 0; i < x ; i++){

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5);
            System.out.printf("A média dos valores reais digitados são: %.1f %n", media);
        }

    }
}
