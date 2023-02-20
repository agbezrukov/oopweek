package com.dmdev.oop.lesson;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuildingRunner {

    private int buildingRunner;
    private Floor[] floor;

    public BuildingRunner(int buildingRunner, Floor[] floor) {
        this.buildingRunner = buildingRunner;
        this.floor = floor;
    }

    public void print() {
        System.out.println("Дом " + buildingRunner + ", количество этажей " + floor.length);
    }

    @Override
    public String toString() {
        return "Дом " + buildingRunner + ", количество этажей " + Arrays.toString(floor);
    }
}
