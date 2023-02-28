package com.dmdev.oop.hw;

public class Asteroid extends CelestialBody implements DiameterCalculations, ObjectComparison {

    private String spectralType;

    public Asteroid(String name, double size, double weight, String spectralType) {
        super(name, size, weight);
        this.spectralType = spectralType;
    }

    @Override
    public boolean objectComparison(double object1, double object2) {
        if (object1 > object2) {
            return false;
        } else return true;
    }

    @Override
    public boolean isLessSun() {
        double SIZE_SUN = 1000.10;
        return SIZE_SUN > getSize();
    }

    @Override
    public double diameterCalculation() {
        return 2 * Math.sqrt(getSize() / Math.PI);
    }

    public String getSpectralType() {
        return spectralType;
    }

    public void setSpectralType(String spectralType) {
        this.spectralType = spectralType;
    }

    @Override
    public String toString() {
        return "Asteroid " + getName() + ", size " + getSize() + ", weight " + getWeight() +
                ", spectralType " + spectralType + '.';
    }
}
