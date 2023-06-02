package com.joantolos.tenda;

public class FixedDiscount implements DiscountStrategy {
    private int minimumPurchase;
    private int discountAmount;

    public FixedDiscount(int minimumPurchase, int discountAmount) {
        this.minimumPurchase = minimumPurchase;
        this.discountAmount = discountAmount;
    }

    @Override
    public Integer applyDiscount(Integer price) {
        if (price >= minimumPurchase) {
            return price - discountAmount;
        }
        return price;
    }
}
