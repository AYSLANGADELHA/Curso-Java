package entities;

import exceptions.BusinessException;

import java.time.Instant;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public void setNumber(Integer number){
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void setWithdrawLimit(Double withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount){
        validateWithdraw(amount);
        this.balance -= amount;
    }

    private void validateWithdraw(double amount){
        if (amount > getWithdrawLimit()){
            throw new BusinessException("Withdrawal error: the amount exceeds the withdrawal limit.");
        }
        if (amount > getBalance()){
            throw new BusinessException("Withdrawal error: insufficient balance");
        }
    }
}

