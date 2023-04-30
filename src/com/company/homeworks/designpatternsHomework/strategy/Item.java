package com.company.homeworks.designpatternsHomework.strategy;

public class Item {

    private String upcCode;
    private String itemName;
    private int price;

    public Item(String upcCode, String itemName, int price) {
        this.upcCode = upcCode;
        this.itemName = itemName;
        this.price = price;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "upCode=" + upcCode +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
