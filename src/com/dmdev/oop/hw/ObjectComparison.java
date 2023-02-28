package com.dmdev.oop.hw;

public interface ObjectComparison {

    default boolean objectComparison(double object1, double object2) {
        return object1 > object2;
    }
}
