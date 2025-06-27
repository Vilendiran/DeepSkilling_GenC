package org.example;

public class BankAccount {
    private int balance;
    public BankAccount(int intialBalance){
        this.balance=intialBalance;
    }
    public void deposit(int amount){
        balance +=amount;
    }
    public boolean withdraw(int amount){
        if (amount> balance)
            return false;
        balance -=amount;
        return true;
    }
    public int getBalance(){
        return balance;
    }
}
