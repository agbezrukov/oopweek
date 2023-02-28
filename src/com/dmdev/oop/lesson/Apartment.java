package com.dmdev.oop.lesson;

import java.util.Arrays;

public class Apartment {

    private int apartment;
    private Room[] room;

    public Apartment(int apartment, Room[] room) {
        this.apartment = apartment;
        this.room = room;
    }

    public void print() {
        System.out.println("Квартира " + apartment + ", количество комнат " + room.length);
    }

    @Override
    public String toString() {
        return apartment + ", количество комнат " + Arrays.toString(room);
    }
}
