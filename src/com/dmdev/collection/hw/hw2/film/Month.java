package com.dmdev.collection.hw.hw2.film;

public enum Month {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private final String month;

    Month(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return month;
    }
}
