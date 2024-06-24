import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /**

         Escreva um programa que repita a leitura de uma senha até que ela seja válida.
         Para cada leitura de senha incorreta informada escrever a mensagem "Senha Invalida".
         Quando a senha for informada corretamente deve ser  impressa a mensagem "Acesso Permitido"
         e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         **/

        int Password = 2002;
        int User;

        System.out.print("SENHA: ");
        User = sc.nextInt();


        while (User != 2002) {
            System.out.print("SENHA INVÁLIDA, tente novamente:  ");
            User = sc.nextInt();

            if (User == 2002) {
                System.out.println("Acesso permitido ! ");
            }

        }

        sc.close();


    }
}
