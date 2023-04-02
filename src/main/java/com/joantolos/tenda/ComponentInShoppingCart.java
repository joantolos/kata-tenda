package com.joantolos.tenda;

public class ComponentInShoppingCart {

    private final Component component;
    private final Integer units;

    public ComponentInShoppingCart(Component component, Integer units) {
        this.component = component;
        this.units = units;
    }

    public Component getComponent() {
        return component;
    }

    public Integer getUnits() {
        return units;
    }
}
