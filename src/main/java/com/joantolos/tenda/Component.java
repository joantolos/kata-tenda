package com.joantolos.tenda;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(name, component.name) && Objects.equals(description, component.description) && Objects.equals(price, component.price) && Objects.equals(stock, component.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, stock);
    }
}
