package com.joantolos.tenda;

import java.util.ArrayList;

public class Member extends Client {

    private final Integer memberNumber;
    private final Integer year;

    public Member(String dni, String name, Integer memberNumber, Integer year) {
        super(dni, name, new ArrayList<>());
        this.memberNumber = memberNumber;
        this.year = year;
    }

    public Integer getMemberNumber() {
        return memberNumber;
    }

    public Integer getYear() {
        return year;
    }

    public Integer discountPercentage() {
        return 10;
    }
}
