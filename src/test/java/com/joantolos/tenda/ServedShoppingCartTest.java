package com.joantolos.tenda;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServedShoppingCartTest {

    private final ComponentInShoppingCart mouse = new ComponentInShoppingCart(new BasicComponent("mouse", "This is a mouse", 50, 55), 2);
    private final ComponentInShoppingCart keyboard = new ComponentInShoppingCart(new BasicComponent("keyboard", "This is a regular USB keyboard", 50, 30), 1);
    private final ComponentInShoppingCart display = new ComponentInShoppingCart(new BasicComponent("display", "This is a big computer dispolay", 150, 20), 1);

    @Test
    public void shouldGetShoppingCartPriceForMemberClient() {
        Member memberClient = new Member("123", "John Doe", 13, 2023);
        ShoppingCart servedShoppingCart = new Served(new Date(), 15, memberClient);

        servedShoppingCart.addComponent(mouse);
        servedShoppingCart.addComponent(keyboard);
        servedShoppingCart.addComponent(display);

        memberClient.addPurchase(servedShoppingCart);

        Assert.assertEquals(new Integer(300), servedShoppingCart.getPrice());   // 300 in total - 30 (which is the 10% of 300)
    }

    @Test
    public void shouldGetShoppingCartPriceForPremiumClient() {
        Premium memberClient = new Premium("123", "John Doe", 13);
        ShoppingCart servedShoppingCart = new Served(new Date(), 15, memberClient);

        servedShoppingCart.addComponent(mouse);
        servedShoppingCart.addComponent(keyboard);
        servedShoppingCart.addComponent(display);

        memberClient.addPurchase(servedShoppingCart);

        Assert.assertEquals(new Integer(300), servedShoppingCart.getPrice());   // 300 in total - 30 (which is the 10% of 300)
    }
}
