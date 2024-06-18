import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /** Faça um programa para ler dois valores inteiros
         e depois mostrar na tela a soma desses números com uma
         mensagem explicativa, conforme exemplos. **/


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int A, B, SOMA;

        A = sc.nextInt();

        System.out.print("Digite outro valor: ");

        B = sc.nextInt();

        SOMA = A + B;


        System.out.printf("O resultado da soma de %d + %d = " + SOMA, A, B);

        sc.close();


    }
}