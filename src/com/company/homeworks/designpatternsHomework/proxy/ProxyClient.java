package com.company.homeworks.designpatternsHomework.proxy;

public class ProxyClient {
    private static SavingAccount savingAccount;

    public static void main(String[] args) {
         savingAccount = new SavingAccount(3000);
        BankAccount debitCardProxy = new DebitCardProxy(savingAccount);
        debitCardProxy.debit(500);
        debitCardProxy.debit(300);
        debitCardProxy.debit(2300);
    }
}
