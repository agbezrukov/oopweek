package com.dmdev.oop.hw;

public class Planet extends CelestialBody implements DiameterCalculations, ObjectComparison {

    private final static int VALUE = 2;
    private Satellite satellite;

    public Planet(String name, double size, double weight, Satellite satellite) {
        super(name, size, weight);
        this.satellite = satellite;
    }

    @Override
    public boolean objectComparison(double object1, double object2) {
        return ObjectComparison.super.objectComparison(object1, object2);
    }

    @Override
    public boolean isLessSun() {
        double sizeSun = 1000.10;
        return sizeSun > getSize();
    }

    @Override
    public double diameterCalculation() {
        return VALUE * Math.sqrt(getSize() / Math.PI);
    }

    public Satellite getSatellite() {
        return satellite;
    }

    public void setSatellite(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public String toString() {
        return "Planet " + getName() + ", size " + getSize() + ", weight " + getWeight() +
                ", Satellite " + satellite;
    }


}
