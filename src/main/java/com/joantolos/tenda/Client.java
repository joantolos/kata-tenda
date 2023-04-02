package com.joantolos.tenda;

import java.util.List;

public abstract class Client {
    private final String dni;
    private final String name;
    private final List<ShoppingCart> purchases;

    public Client(String dni, String name, List<ShoppingCart> purchases) {
        this.dni = dni;
        this.name = name;
        this.purchases = purchases;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public List<ShoppingCart> getPurchases() {
        return purchases;
    }

    public abstract Integer discountPercentage();
}
