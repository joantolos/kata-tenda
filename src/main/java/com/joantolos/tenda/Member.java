package com.joantolos.tenda;

public class Member extends Client implements ClientDiscount {

    private final Integer memberNumber;
    private final Integer year;

    public Member(String dni, String name, Integer memberNumber, Integer year) {
        super(dni, name);
        this.memberNumber = memberNumber;
        this.year = year;
    }

    public Integer getMemberNumber() {
        return memberNumber;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public Integer discountPercentage() {
        return 10;
    }
}
