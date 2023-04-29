package com.company.homeworks.designpatternsHomework.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShoppingCart {
    public ShoppingCart() {
    }

    private List<Item> itemsInCart = new ArrayList<Item>();
    public List<Item> getItems() {
        return this.itemsInCart;
    }

    List<Item> getAllItemsinCart(){
        return this.itemsInCart;
    }

    void addItem(Item item){
        this.itemsInCart.add(item);
    System.out.println("Item added to shopping cart: " + item.getItemName());
    }

    void removeItem(Item item){
        this.itemsInCart.remove(item);
    System.out.println("Item removed from shopping cart: " + item.getItemName());
    }

    public int calculateTotal(){
        int totalAmount = 0;
    for(Item item : this.itemsInCart){
        totalAmount += item.getPrice();
    }
        return totalAmount;
    }

    void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
        itemsInCart.removeAll(itemsInCart);
    }

}
