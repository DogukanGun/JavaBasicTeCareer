package com.company.homeworks.designpatternsHomework.strategy;

public class PaypalStrategy implements PaymentStrategy{

    String emailId;
    String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int total) {
        if(total == 0) {System.out.println("Paypal ile ödeme yapamazsınız. Sepetiniz boş."); return;}

        System.out.println(emailId + " Hesabı ile " + total + " TL ödendi.");
    }
}
