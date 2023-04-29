package com.company.homeworks.designpatternsHomework.strategy.itemBuilder;

import com.company.homeworks.designpatternsHomework.strategy.Item;

public interface ItemBuilder<T> {

    ItemBuilder<T> ItemName(String itemName);
    ItemBuilder<T> ItemUpcCode(String upcCode);
    ItemBuilder<T> ItemPrice(int itemPrice);
    Item getItem();
    ItemBuilder<T> reset();
}
