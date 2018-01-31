package com.company;

public class Main {

    public static void main(String[] args) {



        BankMember zechsAccount = new BankMember();

        System.out.println(zechsAccount);

        zechsAccount.deposit("checking", 500);

        zechsAccount.withdraw("savings", 700);

        System.out.println(zechsAccount);

    }
}
