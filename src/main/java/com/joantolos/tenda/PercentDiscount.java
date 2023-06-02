package com.joantolos.tenda;

public class PercentDiscount implements DiscountStrategy {
    private final int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public Integer applyDiscount(Integer price) {
        double discountAmount = price * (discountPercentage / 100.0);
        return price - (int) discountAmount;
    }
}
