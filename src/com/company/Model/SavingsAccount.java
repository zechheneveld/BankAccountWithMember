package com.company.Model;

import com.company.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, int id, String type, double balance) {
        super(name, id, type, balance);
    }

    @Override
    public void withdraw(double amount){
        System.out.println("Savings account withdraw amount: $" + amount);
        if (balance < amount) {
            System.out.println("Insufficient funds.");
            System.out.println("Savings Account current balance: $" + (balance));
        }else {
            System.out.println("Savings Account current balance: $" + (balance-amount));
        }
    }
    @Override
    public String toString() {
        return (name + " : " + id + " : " + type + " : " + balance);
    }
}
