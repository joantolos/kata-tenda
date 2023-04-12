package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;

public class AssembledComponent extends Component {

    private final List<Component> components;

    public AssembledComponent(String name, String description, Integer price, Integer stock) {
        super(name, description, price, stock);
        this.components = new ArrayList<>();
    }

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }
}
