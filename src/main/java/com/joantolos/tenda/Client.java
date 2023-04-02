package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    private final String dni;
    private final String name;
    private final List<Component> interests;

    public Client(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.interests = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public List<Component> getInterests() {
        return interests;
    }

    public void addInterest(Component component) {
        this.interests.add(component);
    }

    public void removeInterest(Component component) {
        this.interests.remove(component);
    }

    public abstract Integer discountPercentage();
}
