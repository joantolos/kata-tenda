package com.joantolos.tenda;

public class Client {
    private final String dni;
    private final String name;

    public Client(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }
}
