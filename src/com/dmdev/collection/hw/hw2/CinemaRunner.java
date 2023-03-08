package com.dmdev.collection.hw.hw2;

import com.dmdev.collection.hw.hw2.film.Film;
import com.dmdev.collection.hw.hw2.film.Genre;
import com.dmdev.collection.hw.hw2.film.Month;

public class CinemaRunner {
    public static void main(String[] args) {

        Film film1 = new Film(8, 1987, Month.APRIL, Genre.ACTION, 3.5);
        Film film2 = new Film(3, 2011, Month.DECEMBER, Genre.COMEDY, 7.5);
        Film film3 = new Film(4, 2021, Month.AUGUST, Genre.FANTASY, 4.3);
        Film film4 = new Film(11, 2008, Month.JANUARY, Genre.DRAMA, 5.2);
        Film film5 = new Film(1, 2009, Month.JULY, Genre.HORROR, 8.5);
        Film film6 = new Film(18, 2003, Month.JUNE, Genre.FANTASY, 9.0);
        Film film7 = new Film(28, 2008, Month.MARCH, Genre.ACTION, 1.1);
        Film film8 = new Film(34, 2017, Month.FEBRUARY, Genre.COMEDY, 4.2);
        Film film9 = new Film(31, 2005, Month.MAY, Genre.HORROR, 7.7);
        Film film10 = new Film(3, 2022, Month.OCTOBER, Genre.FANTASY, 6.6);
        Film film11 = new Film(1, 2023, Month.SEPTEMBER, Genre.DRAMA, 9.4);
        Film film12 = new Film(55, 2001, Month.DECEMBER, Genre.DRAMA, 2.5);
        Film film13 = new Film(18, 2003, Month.JUNE, Genre.FANTASY, 9.0);
        Film film14 = new Film(28, 2008, Month.MARCH, Genre.ACTION, 1.1);
        Film film15 = new Film(34, 2017, Month.FEBRUARY, Genre.COMEDY, 4.2);
        Film film16 = new Film(77, 2010, Month.MARCH, Genre.DRAMA, 4.1);

        Cinema cinema = new Cinema();
        cinema.addNewFilm(film1);
        cinema.addNewFilm(film2);
        cinema.addNewFilm(film3);
        cinema.addNewFilm(film4);
        cinema.addNewFilm(film5);
        cinema.addNewFilm(film6);
        cinema.addNewFilm(film7);
        cinema.addNewFilm(film8);
        cinema.addNewFilm(film9);
        cinema.addNewFilm(film10);
        cinema.addNewFilm(film11);
        cinema.addNewFilm(film12);
        cinema.addNewFilm(film13);
        cinema.addNewFilm(film14);
        cinema.addNewFilm(film15);
        cinema.addNewFilm(film16);


        System.out.println(cinema.getFilmThisYear(2008));
        System.out.println(cinema.getFilmThisYearAndMonth(2022, Month.OCTOBER));
        System.out.println(cinema.getFilmThisGenre(Genre.ACTION));
        System.out.println(cinema.getTopTenFilms());


    }
}
