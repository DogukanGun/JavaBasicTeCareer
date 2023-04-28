package com.company.designpatterns.strategy;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("10001",150);
        Item item2 = new Item("10006",250);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new PaypalStrategy("customer@email.com", "password"));
        cart.pay(new CreditCardStrategy("Bob Odenkirk ", "0123456789012345", "111", "12/28"));
    }
}
