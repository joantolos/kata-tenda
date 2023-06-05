package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Component extends Subject {

    private final String name;
    private final String description;
    private final Integer price;
    private Integer stock;
    private List<Observer> observers;
    private Category belongsToCategory;

    public Component(String name, String description, Integer price, Integer stock, Category belongsToCategory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.observers = new ArrayList<>();
        this.belongsToCategory = belongsToCategory;
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

    public Category getBelongsToCategory() {
        return belongsToCategory;
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        super.removeObserver(o);
        observers.remove(o);
    }

    public void stockArrive(int quantity) {
        if (stock == 0 && quantity > 0) {
            // L'estoc ha canviat de zero a un nombre positiu
            notifyObservers(name);
        }
        stock += quantity;
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
