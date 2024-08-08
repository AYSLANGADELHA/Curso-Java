import entities.BusinessAccount;
import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        BusinessAccount bA = new BusinessAccount(40028922, "Ayslan", 5000.0, 10000.0);
        System.out.println(bA);


























    }
}