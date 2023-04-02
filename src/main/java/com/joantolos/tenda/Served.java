package com.joantolos.tenda;

import java.util.Date;
import java.util.List;

public class Served extends ShoppingCart {

    public Served(Date date, Integer hour, List<ComponentInShoppingCart> components) {
        super(date, hour, components);
    }
}
