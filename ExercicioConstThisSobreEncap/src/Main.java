import entities.Account;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Account account;

        System.out.print("Enter the number account: ");
        int number = sc.nextInt();


        System.out.print("Enter the name of the account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();


        System.out.print("Is there na initial deposit [y/n]: ");
        char response = sc.next().charAt(0);


        if (response == 'y'){

            System.out.print("Initial deposit: $ ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }

        else{
            account = new Account(number, holder);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: $ ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: $ ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);









        sc.close();
    }
}
