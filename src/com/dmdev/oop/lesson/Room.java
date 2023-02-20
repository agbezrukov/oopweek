package com.dmdev.oop.lesson;

import java.util.Arrays;

public class Room {

    private boolean room;

    public Room(boolean room) {
        this.room = room;
    }

    public void print() {
        if (room){
            System.out.println("проходная");
        } else {
            System.out.println("не проходная");
        }
    }

    @Override
    public String toString() {
        if (!room){
            return "не проходная";
        } else {
            return "проходная";
        }
    }
}
