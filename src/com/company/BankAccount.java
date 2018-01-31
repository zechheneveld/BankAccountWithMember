package com.company;

public class BankAccount {

    public String name;
    public int id;
    public String type;
    public double balance;

    public BankAccount(String name, int id, String type, double balance) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Depositing: $" + balance + " into " + name + "'s " + type);
    }

    public void withdraw(double amount){
        this.balance -= amount;
        System.out.println("Withdrawing: $" + balance + " into " + name + "'s " + type);
    }
}
