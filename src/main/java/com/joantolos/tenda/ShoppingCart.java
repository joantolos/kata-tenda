package com.joantolos.tenda;

import java.util.Date;
import java.util.List;

public class ShoppingCart {

    private final Date date;
    private final Integer hour;
    private final List<ComponentInShoppingCart> components;

    public ShoppingCart(Date date, Integer hour, List<ComponentInShoppingCart> components) {
        this.date = date;
        this.hour = hour;
        this.components = components;
    }

    public Date getDate() {
        return date;
    }

    public Integer getHour() {
        return hour;
    }

    public List<ComponentInShoppingCart> getComponents() {
        return components;
    }

    public String getId() {
        return this.date.toString() + this.hour;
    }

    public Integer getPrice() {
        return 0;
    }
}
