package com.company.homeworks.designpatternsHomework.strategy.itemBuilder;

import com.company.homeworks.designpatternsHomework.strategy.Item;

public class ItemBuilderService implements ItemBuilder{

    private Item item;

    public ItemBuilderService() {
    this.reset();
    }

    @Override
    public ItemBuilder ItemName(String itemName) {
        this.item.setItemName(itemName);
        return this;
    }

    @Override
    public ItemBuilder ItemUpcCode(String upcCode) {
        this.item.setUpcCode(upcCode);
        return this;
    }

    @Override
    public ItemBuilder ItemPrice(int itemPrice) {
        this.item.setPrice(itemPrice);
        return this;
    }

    @Override
    public Item getItem() {
        return this.item;
    }

    @Override
    public ItemBuilder reset() {
        this.item = new Item();
        return this;
    }

}
