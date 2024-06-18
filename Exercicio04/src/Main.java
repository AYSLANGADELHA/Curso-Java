import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /**
         *
        Fazer um programa para ler quatro valores inteiros A, B, C e D.
        A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula:
        DIFERENCA = (A * B - C * D).

        **/

        Scanner sc = new Scanner(System.in);

        int A,B,C,D, DIFERENCA;

        System.out.print("Digite o 1º valor: ");
        A = sc.nextInt();

        System.out.print("Digite o 2º valor: ");
        B = sc.nextInt();

        System.out.print("Digite o 3º valor: ");
        C = sc.nextInt();

        System.out.print("Digite o 4º valor: ");
        D = sc.nextInt();

        DIFERENCA = A * B - C * D;

        System.out.printf("A diferença do produto de %d x %d - %d x %d = %d",A,B,C,D,DIFERENCA);








        }
    }
