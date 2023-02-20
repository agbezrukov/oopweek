package com.dmdev.oop.lesson;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию
 * об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем,
 * его этажах, квартирах и комнатах, вызывая методы print.
 */
public class ApartmentBuildingRunner {
    public static void main(String[] args) {

        BuildingRunner buildingRunner = new BuildingRunner(33, new Floor[3]);

        BuildingRunner buildingRunner1 = new BuildingRunner(22, new Floor[]{new Floor(33,
                new Apartment[]{new Apartment(11, new Room[]{new Room(false)})})});

        printAllInformation(buildingRunner1);
        System.out.println();
        buildingRunner.print();


    }

    public static void printAllInformation(BuildingRunner buildingRunner){
        System.out.println(buildingRunner);
    }
}
