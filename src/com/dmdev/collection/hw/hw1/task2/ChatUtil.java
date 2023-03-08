package com.dmdev.collection.hw.hw1.task2;

import java.util.ArrayList;
import java.util.List;

public class ChatUtil {

    public ChatUtil() {
    }

    public static List<User> addListUsers(List<Chat> chats) {

        List<User> chatList = new ArrayList<>();

        for (Chat chat : chats) {
            List<User> getListUser = chat.getUsers();
            for (User user : getListUser) {
                if (user.getAge() > 18) {
                    chatList.add(user);
                }
            }
        }
        return chatList;
    }

    public static int getAverageAge(List<User> users) {

        int sumAgeUsers = 0;

        for (User user : users) {
            sumAgeUsers += user.getAge();
        }

        return sumAgeUsers / users.size();
    }
}
