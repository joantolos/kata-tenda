package com.joantolos.tenda;

import java.util.Date;
import java.util.List;

public abstract class ShoppingCart {

    private final Date date;
    private final Integer hour;
    private final Client client;
    private final List<ComponentInShoppingCart> components;

    public ShoppingCart(Date date, Integer hour, Client client, List<ComponentInShoppingCart> components) {
        this.date = date;
        this.hour = hour;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public String getId() {
        return this.date.toString() + this.hour;
    }

    // How to discount a percentage:
    // To work out 30% divide 30 by 100 and multiply by the amount. Subtract from the original amount.
    public Integer getPrice() {
        Integer price = 0;
        for (ComponentInShoppingCart componentInShoppingCart : components) {
            price += componentInShoppingCart.getComponent().getPrice() * componentInShoppingCart.getUnits();
        }
        return price - (price * (client.discountPercentage() / 100));
    }
}
