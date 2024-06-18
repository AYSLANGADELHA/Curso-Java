import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Value;

        System.out.print("Digite um valor qualquer: ");
        Value = sc.nextDouble();

        if(Value < 0 || Value > 100){
            System.out.print("Fora de intervalo");
        }
        else if(Value <= 25){
            System.out.print("Intervalo [0,25] ");
        }
        else if(Value <= 50){
            System.out.print("Intervalo [25,50] ");
        }
        else if(Value <= 75){
            System.out.print("Intervalo [50,75] ");
        }
        else{
            System.out.print("Intervalo [75,100] ");
        }



    }
}