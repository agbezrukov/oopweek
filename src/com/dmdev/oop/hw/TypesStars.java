package com.dmdev.oop.hw;

public enum TypesStars {

    RED("3000 K"),
    YELLOW("6000 K"),
    WHITE("10000 K"),
    BLUE("30000 K");

    private String name;

    TypesStars(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
