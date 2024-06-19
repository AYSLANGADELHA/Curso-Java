import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 7 para descobrir o dia da semana: ");
        int Week = sc.nextInt();
        String Day;

        switch (Week){ /** case == caso **/
            case 1:
                Day = "DOMINGO";
                break;
            case 2:
                Day = "SEGUNDA";
                break;
            case 3:
                Day = "TERÇA";
                break;
            case 4:
                Day = "QUARTA";
                break;
            case 5:
                Day = "QUINTA";
                break;
            case 6:
                Day = "SEXTA";
                break;
            case 7:
                Day = "SÁBADO";
                    break;
            default:
                Day = "VALOR INVÁLIDO";
                break;

        }
        System.out.println("Dia da Semana: " + Day);
    }
}