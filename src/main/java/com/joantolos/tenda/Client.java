package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public class Client implements Discount {
    private final String dni;
    private final String name;
    private final List<Component> interests;
    private final List<ShoppingCart> purchases;

    public Client(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.interests = new ArrayList<>();
        this.purchases = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public List<Component> getInterests() {
        return interests;
    }

    public void addInterest(Component component) {
        this.interests.add(component);
    }

    public void removeInterest(Component component) {
        this.interests.remove(component);
    }

    public void addPurchase(ShoppingCart shoppingCart) {
        this.purchases.add(shoppingCart);
    }

    @Override
    public Integer discountPercentage() {
        return 0;
    }
}
