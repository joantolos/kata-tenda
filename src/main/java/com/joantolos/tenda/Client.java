package com.joantolos.tenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client implements ClientDiscount {
    private final String dni;
    private final String name;
    private final List<Interest> interests;
    private final List<ShoppingCart> purchases;

    public Client(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.interests = new ArrayList<>();
        this.purchases = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void addInterest(Component component) {
        this.interests.add(new Interest(component, new Date(), null));
    }

    public void removeInterest(Component component) throws ComponentNotFoundException{
        this.interests.stream()
                .filter(interest -> interest.getComponent().equals(component))
                .findFirst()
                .orElseThrow(ComponentNotFoundException::new)
                .setEndDate(new Date());
    }

    public void addPurchase(ShoppingCart shoppingCart) {
        this.purchases.add(shoppingCart);
    }

    @Override
    public Integer discountPercentage() {
        return 0;
    }

    public List<String> interestedComponentsPerDate(Date date) {
        List<String> interestsPerDate = new ArrayList<>();
        for (Interest itrs : this.interests) {
            if (insidePeriod(itrs.getStartDate(), itrs.getEndDate(), date)) {
                interestsPerDate.add(itrs.getComponent().getName());
            }
        }
        return interestsPerDate;
    }

    private boolean insidePeriod(Date startDate, Date endDate, Date targetDate) {
        return true;
    }
}
