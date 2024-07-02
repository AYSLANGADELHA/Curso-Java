import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Account account;


        System.out.print("Enter the number account: ");
        int numberAccount = sc.nextInt();

        System.out.print("Enter name of the account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();


        System.out.print("Do you want to make an initial deposit [y/n] :  ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter inital deposit: $ ");
            double initialDeposit = sc.nextDouble();
            account = new Account(numberAccount, holder, initialDeposit);
        }

        else{
            account = new Account(numberAccount, holder);
        }

        System.out.println("Update data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: $ ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("Update data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: $ ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Update data: ");
        System.out.println(account);

















    }
}