package com.joantolos.tenda;

public class Premium extends Client implements ClientDiscount {

    private final Integer premiumNumber;

    public Premium(String dni, String name, Integer premiumNumber) {
        super(dni, name);
        this.premiumNumber = premiumNumber;
    }

    public Integer getPremiumNumber() {
        return premiumNumber;
    }

    @Override
    public Integer discountPercentage() {
        return 30;
    }
}
