package com.joantolos.tenda;

public abstract class Component {

    private final String name;
    private final String description;
    private final Integer price;
    private final Integer stock;

    public Component(String name, String description, Integer price, Integer stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }
}
