package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterestController {

    private final List<Component> stock;

    public InterestController() {
        this.stock = new ComponentRepository().getAll();
    }

    public List<Component> showAvailableComponents(Client client) {
        List<Component> currentInterests = client.getInterests().stream().map(Interest::getComponent).collect(Collectors.toList());
        List<Component> availableComponents = new ArrayList<>(stock);
        availableComponents.removeAll(currentInterests);
        return availableComponents;
    }

    public String addNewInterest(Client client, Component component) {
        client.addInterest(component);
        return "Interest successfully registered";
    }

}
