import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        /*

        Fazer um programa para ler os dados de uma reserva de hotel
        (número do quarto, data de entrada e data de saída) e mostrar
        os dados da reserva, inclusive sua duração em dias. Em seguida
        ler novas datas de entrada e saída, atualiazar a reserva e
        mostrar novamente a reserva com os dados atualizados. O programa
        não deve aceitar dados inválidos para a reserva, conforme
        as seguintes regras:

        - Alterações de reserva só podem ocorrer para datas futuras
        - A data de saída deve ser maior que a data de entrada

         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Romm number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        

        sc.close();
    }
}
