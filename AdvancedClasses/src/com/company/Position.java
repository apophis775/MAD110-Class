package com.company;



public enum Position {
    ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"),
    MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");

    private String name;

    Position(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
