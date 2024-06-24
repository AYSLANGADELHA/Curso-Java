import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int User = sc.nextInt();
    int SomaNum = 0;


    while(User != 0){
        SomaNum = SomaNum + User;
        System.out.print("Digite outro número, [0] para parar: ");
        User = sc.nextInt();

    }
        System.out.printf("A soma total dos números que você digitou é %d", SomaNum);

    }
}
