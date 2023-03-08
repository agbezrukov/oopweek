package com.dmdev.collection.hw.hw2;

/**
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 */

import com.dmdev.collection.hw.hw2.film.Film;
import com.dmdev.collection.hw.hw2.film.Genre;
import com.dmdev.collection.hw.hw2.film.Month;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Cinema {

    private final Map<Integer, Set<Film>> filmography = new TreeMap<>();

    public void addNewFilm(Film film) {
        Set<Film> filmSet = filmography.getOrDefault(film.getYear(), new LinkedHashSet<>());
        filmSet.add(film);
        filmography.put(film.getYear(), filmSet);
    }

    public List<Film> getFilmThisYear(int year) {

        List<Film> films = new LinkedList<>();

        for (Map.Entry<Integer, Set<Film>> entry : filmography.entrySet()) {
            Set<Film> filmFilmography = entry.getValue();
            for (Film film : filmFilmography) {
                if (year == film.getYear()) {
                    films.add(film);
                }
            }
        }
        return films;
    }

    public List<Film> getFilmThisYearAndMonth(int year, Month month) {

        List<Film> films = new LinkedList<>();

        for (Map.Entry<Integer, Set<Film>> entry : filmography.entrySet()) {
            Set<Film> filmFilmography = entry.getValue();
            for (Film film : filmFilmography) {
                if (year == film.getYear() && month == film.getMonth()) {
                    films.add(film);
                }
            }
        }
        return films;
    }

    public List<Film> getFilmThisGenre(Genre genre) {

        List<Film> films = new LinkedList<>();

        for (Map.Entry<Integer, Set<Film>> entry : filmography.entrySet()) {
            Set<Film> filmFilmography = entry.getValue();
            for (Film film : filmFilmography) {
                if (genre == film.getGenre()) {
                    films.add(film);
                }
            }
        }
        return films;
    }

    public List<Film> getTopTenFilms() {

        List<Film> films = new ArrayList<>();

        for (Set<Film> filmSet : filmography.values()) {
            films.addAll(filmSet);
        }

        films.sort(Comparator.comparing(Film::getRating).reversed());

        return films.subList(0, 9);
    }
}
