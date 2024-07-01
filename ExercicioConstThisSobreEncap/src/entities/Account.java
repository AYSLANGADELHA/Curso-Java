package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }


    public Account(int number, String holder, double inicialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }


    // Methods get
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }




    // Methods set

    public void setHolder(String holder) {
        this.holder = holder;
    }



    // Methods functions

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @java.lang.Override
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);

    }
}



