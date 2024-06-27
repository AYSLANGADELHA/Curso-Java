import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("NAME: ");
        student.name = sc.nextLine();

        System.out.print("1º: ");
        student.grade1 = sc.nextDouble();
        System.out.print("2º: ");
        student.grade2 = sc.nextDouble();
        System.out.print("3º: ");
        student.grade3 = sc.nextDouble();

        System.out.println("Final grade: " + student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n",  student.misssingPoints());
        }
        else{
            System.out.println(" PASS");
        }

        sc.close();















    }
}
