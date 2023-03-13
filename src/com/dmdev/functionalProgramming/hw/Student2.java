package com.dmdev.functionalProgramming.hw;

import java.util.ArrayList;
import java.util.List;

public class Student2 {

    private int numberCourseStudent2;
    private String nameAndLastName;
    private double averageMark;

    public Student2(int numberCourseStudent2, String nameAndLastName, double averageMark) {
        this.numberCourseStudent2 = numberCourseStudent2;
        this.nameAndLastName = nameAndLastName;
        this.averageMark = averageMark;
    }

    public Student2(String nameAndLastName, double averageMark) {
        this.nameAndLastName = nameAndLastName;
        this.averageMark = averageMark;
    }

    public List<Student2> getNameAndLastNameAndAverageMark(String s, double i){
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(s,i));
        return list;
    }

    public int getNumberCourseStudent2() {
        return numberCourseStudent2;
    }

    public void setNumberCourseStudent2(int numberCourseStudent2) {
        this.numberCourseStudent2 = numberCourseStudent2;
    }

    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public void setNameAndLastName(String nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "firstName and lastName='" + nameAndLastName + '\'' +
                ", average Mark=" + averageMark +
                '}';
    }
}
