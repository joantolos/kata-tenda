package com.joantolos.tenda;

import java.util.List;

public abstract class Category implements ICategory {
    protected String name;
    protected String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract List<Component> getComponents();
}
