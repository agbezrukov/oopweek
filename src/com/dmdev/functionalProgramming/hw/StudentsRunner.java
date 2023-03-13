package com.dmdev.functionalProgramming.hw;

import com.dmdev.collection.hw.hw2.film.Film;
import com.dmdev.collection.lesson7.hashMap.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StudentsRunner {

    public static void main(String[] args) {

        List<Student> listStudents = List.of(
                new Student("Mark", "Markovich", 1, List.of(4, 6, 2, 8, 4, 1, 9)),
                new Student("Danil", "Danilovich", 1, List.of(5, 2, 1, 6, 4, 3, 2)),
                new Student("Gleb", "Glebovich", 1, List.of(4, 6)),
                new Student("Andrey", "Andreevich", 2, List.of(8,6,8,4,5,7)),
                new Student("Alex", "Alexandrovich", 2, List.of(3,8,4,7,5,6,9)),
                new Student("Petya", "Petrovich", 2, List.of(4,2,4,6,7,3,1,2)),
                new Student("Evgeniy", "Kuzmich", 3, List.of(1,3)),
                new Student("Natalya", "Natalyevna", 3, List.of(6,4,2,8,7,6,9,7,5)),
                new Student("Sveta", "Svetikova", 3, List.of(5,6,4,3,6,5,4)),
                new Student("Anjela", "Anjelovna", 4, List.of(7,8,9,7,8,9)),
                new Student("Boris", "Borisovich", 4, List.of(6,7,8,9,6,8,9,7,9)),
                new Student("Kiril", "Kirilovich", 4, List.of(4,6,3,6,7,5,4)));

//        Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

        getMapStudentsWhereKeyNumberCourseAndGetAverage(listStudents);

        System.out.println("_______________________________________");

// * Список студентов данного курса, но только с полями Имя и Фамилия.
// * Список должен быть отсортированы по этим двум полям

        getMapStudentsWgereKeyNumberCourseAndValueFirstNameAndSecondName(listStudents);

//        Объект с двумя полями:
// * - Отсортированный список студентов с пункта 2
//                * - Средняя оценка этих студентов
        System.out.println("_______________________________________");

        getMapStudentsWhereKeyNumberCourseAndSortedNameAndSurname(listStudents);


    }

    private static void getMapStudentsWhereKeyNumberCourseAndSortedNameAndSurname(List<Student> listStudents) {
        Map<Integer, List<Student2>> map1 = listStudents.stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .sorted(Comparator.comparing(Student::getFirstName))
                .map(s -> new Student2(s.getCourseNumber(), s.getFirstNameAndLastName(), s.getAverage()))
                .collect(Collectors.groupingBy(Student2::getNumberCourseStudent2,
                        Collectors.toList()));

        System.out.println(map1);
    }

    private static void getMapStudentsWgereKeyNumberCourseAndValueFirstNameAndSecondName(List<Student> listStudents) {
        Map<Integer, List<Student>> map = listStudents.stream()
                .map(s -> new Student(s.getFirstName(), s.getLastName(), s.getCourseNumber()))
                .sorted(Comparator.comparing(Student::getLastName))
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.toList()));

        System.out.println(map);
    }

    private static void getMapStudentsWhereKeyNumberCourseAndGetAverage(List<Student> listStudents) {
        Map<Integer, List<Double>> mapStudents1 = listStudents.stream()
                .filter(c -> c.getMark().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber,
                        Collectors.mapping(Student::getAverage, Collectors.toList())));
        System.out.println(mapStudents1);
    }


}





