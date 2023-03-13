package com.dmdev.functionalProgramming.hw;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int courseNumber;
    private List<Integer> mark = new ArrayList<>();

    public Student(String firstName, String lastName, int courseNumber, List<Integer> mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
        this.mark = mark;
    }

    public Student(String firstName, String lastName, int courseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseNumber = courseNumber;
    }

    public Double getAverage() {
        return getMark().stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
    }

    public String getFirstNameAndLastName(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

