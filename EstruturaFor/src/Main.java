import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vão ser digitados: ");
        int N = sc.nextInt();
        int soma = 0;

        for(int i=0; i<N ; i=i+1){
            int X = sc.nextInt();
            soma = soma + X;

        }


        System.out.printf("A soma dos valores digitados foi de %d", soma);


        sc.close();


    }
}
