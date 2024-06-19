
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {


        /**

         Uma operadora de telefonia cobra R$ 50.00 por um plano
         básico que da direito a 100 minutos de telefone.
         Cada minuto que exceder a franquia de 100 minutos
         custa R$ 2.00. Fazer um programa para ler a quantidade
         de minutos que uma pessoa consumiu, daí mostrar o valor
         a ser pago !

         **/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.print("Quantos minutos você consumiu do seu pacote: ");

        int Minute = sc.nextInt();
        double Account = 50.00;

        if (Minute > 100){
            Account = Account  + (Minute - 100) * 2;
            System.out.printf("Você pagará um total de R$ %.2f REAIS", Account);
        }
        else{
            System.out.print("Você continuará pagando o valor normal de R$ 50.00");
        }

        sc.close();
    }
}
