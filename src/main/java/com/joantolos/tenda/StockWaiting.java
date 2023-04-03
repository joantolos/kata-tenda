package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockWaiting extends ShoppingCart {

    private final List<Component> waitingFor;

    public StockWaiting(Date date, Integer hour, Client client) {
        super(date, hour, client);
        this.waitingFor = new ArrayList<>();
    }

    public void addWaitingComponent(Component waitingComponent) {
        this.waitingFor.add(waitingComponent);
    }

    public void removeWaitingComponent(Component waitingComponent) {
        this.waitingFor.remove(waitingComponent);
    }
}
