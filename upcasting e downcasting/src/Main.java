import entities.BusinessAccount;
import entities.Account;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // BusinessAccount bA = new BusinessAccount(40028922, "Ayslan", 5000.0, 10000.0);
        // System.out.println(bA);


        Account acc = new Account(1001, "Alex", 10.0);
        BusinessAccount bacc = new BusinessAccount(40028922, "Ayslan", 0.0, 500.0);


        // UPCASTING

        Account acc01 = bacc;
        acc01.getBalance();

        // BusinessAccount a1 = new BusinessAccount(1003, "Ayslan", 0.0, 200.0);
        Account acc02 = new BusinessAccount(1003, "Ayslan", 0.0, 200.0);


        Account acc03 = new SavingsAccount(23249226, "Ayslan", 2.0, 5.0);



        // DOWNCASTING

        BusinessAccount ba01 = (BusinessAccount) acc02;
        // BusinessAccount ba02 = (BusinessAccount) acc03;

        if (acc03 instanceof BusinessAccount){
            BusinessAccount ba02 = (BusinessAccount) acc03;
            ba02.loan(200.0);
            System.out.println("Empréstimo");
        }

        if (acc03 instanceof SavingsAccount){
            SavingsAccount ba02 = (SavingsAccount) acc03;
            ba02.updateBalance();
            System.out.println("Update");
            System.out.println(ba02);
        }





















    }
}