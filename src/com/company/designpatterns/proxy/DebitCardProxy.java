package com.company.designpatterns.proxy;

import java.util.List;

public class DebitCardProxy implements BankAccount{

    SavingAccount savingAccount;

    public DebitCardProxy(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public void debit(){
        if (savingAccount.validate()){
            savingAccount.debit();
        } else {
            System.out.println("This card does not belong to this account.");
        }
    }
}
