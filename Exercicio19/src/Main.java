import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /**

         Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
         Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
         essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
         **/


        int in = 0;
        int out = 0;

        System.out.print("Quantas vezes vai ser repetido:  ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Valor de X: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1; /** in siginifica dentro do intervalo [10 20] **/
            } else {
                out = out + 1; /** out significa fora do intervalo [10 20] **/
            }
        }

        System.out.println(in + " in");
        System.out.print(out + " out");
    }
}
