package com.joantolos.tenda;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServedShoppingCartTest {

    @Test
    public void shouldGetShoppingCartPrice() {
        ComponentInShoppingCart mouse = new ComponentInShoppingCart(new Component("mouse", "This is a mouse", 50, 55), 2);
        ComponentInShoppingCart keyboard = new ComponentInShoppingCart(new Component("keyboard", "This is a regular USB keyboard", 50, 30), 1);
        ComponentInShoppingCart display = new ComponentInShoppingCart(new Component("display", "This is a big computer dispolay", 150, 20), 1);
        List<ComponentInShoppingCart> components = new ArrayList<>();
        components.add(mouse);
        components.add(keyboard);
        components.add(display);
        Member memberClient = new Member("123", "John Doe", 13, 2023);
        ShoppingCart servedShoppingCart = new Served(new Date(), 15, memberClient, components);
        Assert.assertEquals(new Integer(270), servedShoppingCart.getPrice());   // 300 in total - 30 (which is the 10% of 300)
    }
}
