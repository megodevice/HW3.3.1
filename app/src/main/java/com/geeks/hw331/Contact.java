package com.geeks.hw331;

public class Contact {
    private final String name;
    private final String surname;

    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
