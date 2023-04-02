package com.joantolos.tenda;

import java.util.Date;
import java.util.List;

public class StockWaiting extends ShoppingCart {

    public StockWaiting(Date date, Integer hour, List<ComponentInShoppingCart> components) {
        super(date, hour, components);
    }
}
