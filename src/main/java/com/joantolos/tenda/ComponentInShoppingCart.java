package com.joantolos.tenda;

public class ComponentInShoppingCart {

    private final ShoppingCart shoppingCart;
    private final Component component;
    private final Integer units;

    public ComponentInShoppingCart(ShoppingCart shoppingCart, Component component, Integer units) {
        this.shoppingCart = shoppingCart;
        this.component = component;
        this.units = units;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Component getComponent() {
        return component;
    }

    public Integer getUnits() {
        return units;
    }

    public String getId(String shoppingCartId) {
        return shoppingCartId + component.getName();
    }
}
