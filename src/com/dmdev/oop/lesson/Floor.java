package com.dmdev.oop.lesson;

import java.util.Arrays;

public class Floor {

    private int floor;
    private Apartment[] apartment;

    public Floor(int floor, Apartment[] apartment) {
        this.floor = floor;
        this.apartment = apartment;
    }

    public void print() {
        System.out.println("Этаж " + floor + ", количество квартир " + apartment.length);
    }

    @Override
    public String toString() {
        return floor + ", количество квартир " + Arrays.toString(apartment);
    }
}
