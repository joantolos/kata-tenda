package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String name) {
        for (Observer observer : observers) {
            observer.sendNotificationEmail(name);
        }
    }
}
