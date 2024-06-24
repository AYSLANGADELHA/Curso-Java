import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        /**

         * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
         * Escreva um algoritmo para ler o tipo de combustível abastecido
         * (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
         * Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
         * deve ser solicitado um novo código (até que seja válido).
         * O programa será encerrado quando o código informado for o número 4.
         * Deve ser escrito a  mensagem: "MUITO OBRIGADO"
         * e a quantidade de clientes que abasteceram cada tipo de combustível

         */



        int Gasolina = 0;
        int Álcool = 0;
        int Diesel = 0;


        System.out.printf("ESCOLHA O TIPO DE COMBUSTÍVEL: %n ");
        System.out.printf("1 - Álcool %n 2 - Gasolina %n 3 - Diesel %n 4 - Fim %n");

        int Fuel = 0;
        Fuel = sc.nextInt();

        while (Fuel != 4){

            if (Fuel == 1){
                Álcool = Álcool + 1;
                System.out.println("Álcool abastecido ! ");
            }

            else if (Fuel == 2){
                Gasolina = Gasolina + 1;
                System.out.println("Gasolina abastecida ! ");
            }

            else if (Fuel == 3){
                Diesel = Diesel + 1;
                System.out.println("Diesel abastecido ! ");

            }

            System.out.print("Escolha o combustível: ");
            Fuel = sc.nextInt();
        }

        System.out.printf("MUITO OBRIGADO%n%d pessoa(s) abasteceram com Gasolina%n%d pessoa(s) abasteceram com Diesel%n%d pessoa(s) abasteceram com Álcool", Gasolina, Diesel, Álcool);










    }
}
