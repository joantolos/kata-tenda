package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public class ExternalCategory extends Category {

    public ExternalCategory(String name, String description) {
        super(name, description);
    }

    @Override
    public List<Component> getComponents() {
        return new ArrayList<>();
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
