package com.dmdev.oop.hw;

/**
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними
 * (можно придумать любую формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет
 */
public final class SpaceUtils {

    private final static double starSize = 1500.00;

    public SpaceUtils() {
    }

    public static double gravitationalForceBetweenObjects(double object1, double object2) {
        double constantGravity = 6.74;
        return (object1 + object2) / constantGravity;
    }

    public static boolean isStar(double object) {
        return object >= starSize;
    }

}
