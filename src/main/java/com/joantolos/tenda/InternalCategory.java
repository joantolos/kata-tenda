package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public class InternalCategory extends Category {

    private List<Component> components;

    public InternalCategory(String name, String description) {
        super(name, description);
        components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
