package com.dmdev.collection.hw.hw1.task2;

import java.util.ArrayList;
import java.util.List;


/**
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей”
 * будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * <p>
 * Задача:
 * <p>
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * <p>
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class ChatRunner {
    public static void main(String[] args) {


        Chat chat1 = new Chat("Rome", List.of(
                new User(9, "Alex", 77),
                new User(11, "Denis", 14)));
        Chat chat2 = new Chat("Rok", List.of(
                new User(44, "Meri", 5),
                new User(90, "Loki", 65)));
        Chat chat3 = new Chat("Kos", List.of(
                new User(11, "Geri", 45),
                new User(80, "Mok", 9)));
        Chat chat4 = new Chat("Lik", List.of(
                new User(14, "Sari", 35),
                new User(70, "Mark", 41)));
        Chat chat5 = new Chat("Man", List.of(
                new User(63, "Lari", 15),
                new User(60, "Pol", 87)));

        List<Chat> chats = new ArrayList<>(List.of(chat1, chat2, chat3, chat4, chat5));
        List<User> users = ChatUtil.addListUsers(chats);

        for (User user : users) {
            System.out.println(user);
        }

        System.out.println(ChatUtil.getAverageAge(users));
    }
}
