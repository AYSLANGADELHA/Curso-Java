import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /**

         Ler um número inteiro N e calcular todos os seus divisores.

         **/


        int ContDiv = 0;

        System.out.print("Divisores de qual número você quer descobrir: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n ; i++){
            if(n % i == 0){
                ContDiv = ContDiv + 1;
                System.out.println(i);
            }

        }

        System.out.printf("O número que você digitou tem %d divisores", ContDiv);

        sc.close();
    }
}
