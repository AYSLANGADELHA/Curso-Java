import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**

         Fazer um programa para ler um número N.
         Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
         Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

         **/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas vezes vai se repetir: ");
        int n = sc.nextInt();


        for(int i = 0; i < n ; i++){

            System.out.print("NUMERADOR:  ");
            int x = sc.nextInt();

            System.out.print("DENOMINADOR: ");
            int y = sc.nextInt();

            if(y == 0){
                System.out.print("Divisão impossível");
            }

            else{
                double div = (double) x/y;
                System.out.printf("A divisão dos números digitados é %.1f %n", div);

            }

        }
        System.out.println("PROGRAMA ENCERRADO");




    }
}
