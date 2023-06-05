package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public class SearchableCategoryDecorator implements ICategory {
    private ICategory decoratedCategory;

    public SearchableCategoryDecorator(ICategory decoratedCategory) {
        this.decoratedCategory = decoratedCategory;
    }

    public List<Component> getComponents() {
        return decoratedCategory.getComponents();
    }

    public String getName() {
        return decoratedCategory.getName();
    }

    public String getDescription() {
        return decoratedCategory.getDescription();
    }

    public List<Component> search(String text) {
        List<Component> searchResults = new ArrayList<>();
        List<Component> components = decoratedCategory.getComponents();

        for (Component component : components) {
            if (component.getName().contains(text) || component.getDescription().contains(text)) {
                searchResults.add(component);
            }
        }

        return searchResults;
    }
}
