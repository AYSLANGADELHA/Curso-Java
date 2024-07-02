package entities;

public class Account {

    private int number;
    private String holder;
    private double deposit;

    public Account(int account, String holder, double deposit) {
        this.number = account;
        this.holder = holder;
        this.deposit = deposit;
    }

    public Account(int account, String holder){
        this.number = account;
        this.holder = holder;
    }


    //Methods
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount){
        deposit += amount;
    }

    public void withdraw(double amount){
        deposit -= amount + 5;
    }


    @Override
    public String toString() {
        return "Account: " +
                 number +
                ", Holder: " + holder +
                " , Deposit: $ " + deposit ;

    }
}


