package com.company.designpatterns.proxy;


public class ProxyClient {
    public static void main(String[] args) {

        DebitCardProxy card = new DebitCardProxy(new SavingAccount());
        System.out.println("Enter your card password");

        card.debit();
    }
}
