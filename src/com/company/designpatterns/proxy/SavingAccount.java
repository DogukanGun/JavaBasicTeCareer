package com.company.designpatterns.proxy;

public class SavingAccount implements BankAccount{
    public void debit(){
        System.out.println("Cash withdrawn.");
    }

    public boolean validate(){
        return true;
    }
}
