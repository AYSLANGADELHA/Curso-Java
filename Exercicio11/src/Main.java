import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /** https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java **/

    Scanner sc = new Scanner(System.in);

    int cod, amount;
    double total;

        System.out.printf
                ("1 - Cachorro Quente%n" +
                "2 - X-Salada%n" +
                "3 - X-Bacon%n" +
                "4 - Torrada Simples%n" +
                "5 - Refrigerante%n" +
                        "Digite o código do produto de sua preferência: ");
        cod = sc.nextInt();

        System.out.print("Quantos você gostaria: ");
        amount = sc.nextInt();

        if (cod == 1){
            total = amount * 4.0;
        }
        else if (cod == 2){
            total = amount * 4.50;
        }
        else if (cod == 3){
            total = amount * 5.0;
        }
        else if (cod == 4){
            total = amount * 2.0;
        }
        else{
            total = amount * 1.50;
        }

        System.out.printf("Valor Total R$ %.2f", total);







    }
}

