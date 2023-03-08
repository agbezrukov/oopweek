package com.dmdev.collection.hw.hw1.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * <p>
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class ChatRunner {
    public static void main(String[] args) {

        Chat chat1 = new Chat("chat500", 500);
        Chat chat2 = new Chat("chat550", 550);
        Chat chat3 = new Chat("chat570", 570);
        Chat chat4 = new Chat("chat300", 300);
        Chat chat5 = new Chat("chat700", 700);
        Chat chat6 = new Chat("chat200", 200);
        Chat chat7 = new Chat("chatRun", 1000);
        Chat chat8 = new Chat("chatMove", 1500);
        Chat chat9 = new Chat("chatBom", 2500);
        Chat chat10 = new Chat("chatDark", 1000);
        Chat chat18 = new Chat("chatFlat", 1500);
        Chat chat19 = new Chat("chatGod", 2500);

        List<Chat> chat = new ArrayList<>(List.of(chat1, chat2, chat3, chat4, chat5, chat6, chat7,
                chat8, chat9, chat10, chat18, chat19));

        ChatUtil.deleteChatLessThanThousand(chat);
        ChatUtil.numberUsersAndNameComparator(chat);
        System.out.println(chat);


    }


}
