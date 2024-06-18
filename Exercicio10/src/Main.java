import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**

         Leia a hora inicial e a hora final de um jogo.
         A seguir calcule a duração do jogo, sabendo que o mesmo pode
         começar em um dia e terminar em outro
         tendo uma duração mínima de 1 hora e máxima de 24 horas.

         **/

        Scanner sc = new Scanner (System.in);

        int StartTime, EndTime, Duration;

        System.out.print("Hora Inicial: ");
        StartTime = sc.nextInt();

        System.out.print("Hora Final: ");
        EndTime = sc.nextInt();

        if (StartTime < EndTime){
            Duration = EndTime - StartTime;
        }
        else{
            Duration = 24 - StartTime + EndTime;
        }

        System.out.printf("O JOGO DUROU %d HORAS",Duration);
        sc.close();





    }
}