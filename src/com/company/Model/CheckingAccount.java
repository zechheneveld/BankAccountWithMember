package com.company.Model;

import com.company.BankAccount;

public class CheckingAccount extends BankAccount {

    private final double OVERDRAFT_FEE = 35;

    public CheckingAccount(String name, int id, String type, double balance) {
        super(name, id, type, balance);
    }

    @Override
    public  void withdraw(double amount){
        if (balance < amount){
            System.out.println("Checking account withdraw amount: $" + amount);
            balance = (balance - amount) - OVERDRAFT_FEE;
            System.out.println("Overdraft fee: $" + OVERDRAFT_FEE);
            System.out.println("Checking Account current balance: $" + balance);
        } else {
            System.out.println("Checking account withdraw amount: $" + amount);
            System.out.println("New Checking Account current balance: $" + (balance-amount));
        }
    }
    @Override
    public String toString() {
        return (name + " : " + id + " : " + type + " : " + balance);

    }
}
