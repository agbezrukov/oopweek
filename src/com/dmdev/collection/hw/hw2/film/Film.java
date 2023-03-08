package com.dmdev.collection.hw.hw2.film;

import java.util.Objects;

/**
 * Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 */
public class Film {

    private int id;
    private int year;
    private Month month;
    private Genre genre;
    private double rating;

    public Film(int id, int year, Month month, Genre genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && year == film.year && Double.compare(film.rating, rating) == 0 && month == film.month && genre == film.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, month, genre, rating);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "\n" + "Film " +
                "id = " + id +
                ", год создания " + year +
                ", месяц " + month +
                ", жанр " + genre +
                ", рейтинг " + rating;
    }
}
