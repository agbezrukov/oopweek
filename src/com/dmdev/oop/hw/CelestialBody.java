package com.dmdev.oop.hw;

public abstract class CelestialBody {

    private String name;
    private double size;
    private double weight;

    public CelestialBody(String name, double size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract boolean isLessSun();

}
