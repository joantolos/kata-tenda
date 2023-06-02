package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class ShoppingCart {

    private final Date date;
    private final Integer hour;
    private final Client client;
    private final List<ComponentInShoppingCart> components;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(Date date, Integer hour, Client client) {
        this.date = date;
        this.hour = hour;
        this.client = client;
        this.components = new ArrayList<>();
        // Per defecte, no hi ha cap descompte aplicat
        discountStrategy = null;
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

    public Client getClient() {
        return client;
    }

    public String getId() {
        return this.date.toString() + this.hour;
    }

    public void addComponent(ComponentInShoppingCart component) {
        this.components.add(component);
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        discountStrategy = strategy;
    }

    public Integer getPrice() {
        int totalPrice = 0;
        for (ComponentInShoppingCart component : components) {
            totalPrice += component.getComponent().getPrice() * component.getUnits();
        }
        return totalPrice;
    }

    public Integer getPriceWithDiscount() {
        int price = getPrice();
        if (discountStrategy != null) {
            return discountStrategy.applyDiscount(price);
        }
        return price;
    }
}
