package com.CSAssignments;

public abstract class BankAccount {
    private String pin;
    private double balance;

    public BankAccount (){

    }
    public BankAccount(String p, double bal){
        balance= bal;
        pin = p;

    }

}
