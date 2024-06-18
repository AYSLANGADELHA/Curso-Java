

import java.util.Locale;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) {

       /** Faça um programa para ler o valor do raio de um círculo
        e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio^2
        Considere o valor de π = 3.14159 **/

        double A, R, PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.print("RAIO: ");
        R = sc.nextDouble();

        A = PI * R * R;

        System.out.printf("A área do círculo é  = %.4f", A);


        sc.close();
    }
}


