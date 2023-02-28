package com.dmdev.oop.hw;

public class Star implements DiameterCalculations {

    private String name;
    private double size;
    private double temperature;
    private TypesStars typesStars;

    public Star(String name, double size, double temperature, TypesStars typesStars) {
        this.name = name;
        this.size = size;
        this.temperature = temperature;
        this.typesStars = typesStars;
    }

    @Override
    public double diameterCalculation() {
        return 2 * Math.sqrt(getSize() / Math.PI);
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

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TypesStars getTypesStars() {
        return typesStars;
    }

    public void setTypesStars(TypesStars typesStars) {
        this.typesStars = typesStars;
    }

    @Override
    public String toString() {
        return "Star: name " + getName() +
                ", size " + getSize() +
                ", temperature=" + getTemperature() +
                ", typesStars " + getTypesStars() + ".";
    }
}
