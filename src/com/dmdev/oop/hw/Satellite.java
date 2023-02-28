package com.dmdev.oop.hw;

public class Satellite {

    private String name;
    private double distanceFromThePlanet;

    public Satellite(String name, double distanceFromThePlanet) {
        this.name = name;
        this.distanceFromThePlanet = distanceFromThePlanet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromThePlanet() {
        return distanceFromThePlanet;
    }

    public void setDistanceFromThePlanet(double distanceFromThePlanet) {
        this.distanceFromThePlanet = distanceFromThePlanet;
    }

    @Override
    public String toString() {
        return " name " + getName() + ", distanceFromThePlanet " + getDistanceFromThePlanet() + ".";
    }
}
