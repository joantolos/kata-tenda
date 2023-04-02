package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class ShoppingCart {

    private final Date date;
    private final Integer hour;
    private final Client client;
    private final List<ComponentInShoppingCart> components;

    public ShoppingCart(Date date, Integer hour, Client client) {
        this.date = date;
        this.hour = hour;
        this.client = client;
        this.components = new ArrayList<>();
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

    // How to discount a percentage:
    // To work out 30% divide 30 by 100 and multiply by the amount. Subtract from the original amount.
    public Integer getPrice() {
        Double price = 0D;
        for (ComponentInShoppingCart componentInShoppingCart : components) {
            price += componentInShoppingCart.getComponent().getPrice() * componentInShoppingCart.getUnits();
        }
        double discount = Double.valueOf(client.discountPercentage()) / new Double(100);
        return ((Double) (price - (price * discount))).intValue();
    }
}
