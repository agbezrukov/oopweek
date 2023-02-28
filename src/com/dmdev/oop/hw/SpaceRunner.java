package com.dmdev.oop.hw;

public class SpaceRunner {
    public static void main(String[] args) {

        Planet planet1 = new Planet("Mars", 300.4, 450.40,
                new Satellite("Fobos", 4.9));
        Planet planet2 = new Planet("Mars", 300.4, 450.40,
                new Satellite("Damos", 2.8));

        Star star = new Star("Sun", 10000, 2000, TypesStars.YELLOW);

        System.out.println(star);

        System.out.println(planet2.isLessSun());
        System.out.println(planet1);

        CelestialBody asteroid1 = new Asteroid("Ceres", 120.2, 20.0, "C");
        System.out.println(asteroid1);

        System.out.println(SpaceUtils.gravitationalForceBetweenObjects(planet1.getSize(), asteroid1.getSize()));
        System.out.println(SpaceUtils.isStar(asteroid1.getSize()));
    }
}
