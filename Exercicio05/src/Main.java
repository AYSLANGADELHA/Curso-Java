import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         Fazer um programa para ler o código de uma peça 1
         o número de peças 1, o valor unitário de cada peça 1
         código de uma peça 2
         o número de peças 2
         e o valor unitário de cada peça 2.
         Calcule e mostre o valor a ser pago
         **/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod1,cod2, total;
        int part1, part2;
        double price1, price2;

        System.out.print("Digite o código da peça 1: ");
        cod1 = sc.nextDouble();

        System.out.print("Quantas peças são: ");
        part1 = sc.nextInt();

        System.out.print("Qual o valor de uma uniade da peça 1, R$ ");
        price1 = sc.nextDouble();

        /** código da peça 2 **/

        System.out.print("Digite o código da peça 2: ");
        cod2 = sc.nextDouble();
        System.out.print("Quantas peças são: ");
        part2 = sc.nextInt();
        System.out.print("Qual valor da unidade da peça 2, R$  ");
        price2 = sc.nextDouble();

        total = (part1 * price1) + (part2 * price2);

        System.out.printf("O valor somado os valores e unidades de ambas peças é de R$ %.2f reais", total);















    }
}



