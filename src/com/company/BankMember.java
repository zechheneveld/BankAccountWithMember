package com.company;

import com.company.Model.CheckingAccount;
import com.company.Model.SavingsAccount;


public class BankMember {

    Boolean ask = true;

    CheckingAccount checkingAccount;
    SavingsAccount savingsAccount;

    public BankMember(){

        this.checkingAccount = new CheckingAccount("Zech Heneveld", 12345, "Checking Account",0);
        this.savingsAccount = new SavingsAccount("Zech Heneveld", 12345, "Savings Account", 0);

    }

    public void deposit(String type, double amount){
        if(type.equalsIgnoreCase("checking")){
            checkingAccount.deposit(amount);
        } else if(type.equalsIgnoreCase("savings")){
            savingsAccount.deposit(amount);
        }
    }

    public void withdraw(String type, double amount){
        if (type.equalsIgnoreCase("Checking")){
            checkingAccount.withdraw(amount);
        } else if (type.equalsIgnoreCase("Savings")){
            savingsAccount.withdraw(amount);
        }
    }
//    @Override
//    public String toString(){
//        return
//    }
}
