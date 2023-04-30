package com.company.homeworks.designpatternsHomework.proxy;

public class SavingAccount implements BankAccount {

    private int balance;

    public SavingAccount() {
    }

    public SavingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void debit(int amount) {

        this.balance -= amount;
        System.out.println("İşlem başarılı. " + amount + "TL çektiniz, " +
                "kalan para: " + this.balance);


    }

    boolean validate(int amount) {
        if (amount <= balance || amount < 0) {
            return true;
        }
        return false;

    }
}
