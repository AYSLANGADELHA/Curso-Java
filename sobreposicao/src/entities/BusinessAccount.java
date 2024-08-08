package entities;

public class BusinessAccount  extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit)
           balance += amount - 10.0;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;

    }

    @Override
    public String toString() {
            StringBuilder SB = new StringBuilder();
            SB.append("holder: ");
            SB.append(getHolder() + "\n");
            SB.append("number account: " );
            SB.append(getNumber() + "\n");
            SB.append("balance: ");
            SB.append(getBalance() + "\n");
            SB.append("loanlimit: ");
            SB.append(loanLimit);
            return SB.toString();


        }
    }

