package com.dmdev.collection.hw.hw2.film;

public enum Genre {
    ACTION("Боевик"),
    COMEDY("Комедия"),
    DRAMA("Драма"),
    FANTASY("Фантастика"),
    HORROR("Ужасы");

    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}
