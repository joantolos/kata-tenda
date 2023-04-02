package com.joantolos.tenda;

public class Member extends Client {

    private final Integer memberNumer;
    private final Integer year;

    public Member(String dni, String name, Integer memberNumer, Integer year) {
        super(dni, name);
        this.memberNumer = memberNumer;
        this.year = year;
    }

    public Integer getMemberNumer() {
        return memberNumer;
    }

    public Integer getYear() {
        return year;
    }
}
