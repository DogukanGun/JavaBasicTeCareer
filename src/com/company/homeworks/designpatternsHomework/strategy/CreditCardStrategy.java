package com.company.homeworks.designpatternsHomework.strategy;

public class CreditCardStrategy implements PaymentStrategy{


    String name;
    String cardNumber;
    String cvv;
    String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int total) {
        if(total == 0)
        {System.out.println("Kredi kartı ile ödeme yapamazsınız. Sepetiniz boş."); return;}

        System.out.println(cardNumber + " Numaralı kart ile " + total + " TL ödendi.");
    }
}
