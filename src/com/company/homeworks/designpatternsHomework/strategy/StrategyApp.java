package com.company.homeworks.designpatternsHomework.strategy;

import com.company.homeworks.designpatternsHomework.strategy.itemBuilder.ItemBuilder;
import com.company.homeworks.designpatternsHomework.strategy.itemBuilder.ItemBuilderService;

public class StrategyApp {

    private static ItemBuilderService itemBuilder;
    private static Item item;
    private static ShoppingCart shoppingCart;



    public static void main(String[] args) {
        itemBuilder = new ItemBuilderService();
        shoppingCart = new ShoppingCart();
        PaymentStrategy paypal = new PaypalStrategy("gokhanasilturkk","gkn8855");
        PaymentStrategy creditCard = new CreditCardStrategy("Gokhan","5522664455",
                                                                "860","25.09.2025");

        item = itemBuilder.ItemName("Laptop").ItemUpcCode("UC55").ItemPrice(6000).getItem();
        shoppingCart.addItem(item);
        itemBuilder.reset();
        item = itemBuilder.ItemName("Iphone").ItemPrice(3000).ItemUpcCode("SD6754").getItem();
        shoppingCart.addItem(item);
        itemBuilder.reset();

        System.out.println("All items in your shopping cart: \n" + shoppingCart.getAllItemsinCart());
        shoppingCart.pay(paypal);

        item = itemBuilder.ItemName("Şarj Kablosu").ItemPrice(26).ItemUpcCode("KB486").getItem();
        shoppingCart.addItem(item);
        shoppingCart.pay(creditCard);


    }
}
