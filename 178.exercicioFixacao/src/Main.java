import entities.Account;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the account details");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance $ ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdrawal limit $ ");
        double withdrawalLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawalLimit);

        System.out.println();
        System.out.print("Enter an amount to withdraw: ");
        double withdraw = sc.nextDouble();
        try {
            acc.withdraw(withdraw);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch(BusinessException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}