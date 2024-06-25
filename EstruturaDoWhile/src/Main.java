import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura em Cº : ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0; /** Transformar Cº em Fº **/

            System.out.printf("%.1fCº equivalente em Fº é %.1fº %n", C, F);
            System.out.print("Quer continuar [s/n] : ");
            resp = sc.next().charAt(0); /** charAt - funciona para pegar uma unica letra **/
        } while (resp != 'n');


        System.out.print("OBRIGADO! Volte sempre");
        sc.close();
    }
}
