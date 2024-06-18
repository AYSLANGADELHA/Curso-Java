import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        /**

         Fazer um programa para ler um número inteiro
         e depois dizer se este número é negativo ou não.

        **/


        int Negative;

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        Negative = sc.nextInt();

        if (Negative < 0){
            System.out.println("O número digitado é negativo");
        }
        else{
            System.out.println("O número digitado não é negativo");
        }

        sc.close();
        


    }
}
