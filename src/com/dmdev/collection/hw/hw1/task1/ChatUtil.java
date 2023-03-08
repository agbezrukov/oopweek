package com.dmdev.collection.hw.hw1.task1;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ChatUtil {

    private static final int NUMBER_USERS_THOUSAND = 1000;
    private static final Comparator<Chat> BY_USER_NUMBER = Comparator.comparing(Chat::getNumberUsers).reversed();
    private static final Comparator<Chat> BY_USER_NAME = Comparator.comparing(Chat::getName);
    private static final Comparator<Chat> BY_USER_NUMBER_AND_NAME = BY_USER_NUMBER.thenComparing(BY_USER_NAME);

    public ChatUtil() {
    }

    public static void deleteChatLessThanThousand(List<Chat> chat) {

        ListIterator<Chat> chatListIterator = chat.listIterator();

        while (chatListIterator.hasNext()) {

            int chatNumber = chatListIterator.next().getNumberUsers();
            if (chatNumber < NUMBER_USERS_THOUSAND) {
                chatListIterator.remove();
            }
        }
    }

    public static void numberUsersAndNameComparator(List<Chat> chat) {
//        chat.sort(Comparator.comparing(Chat::getNumberUsers).reversed().thenComparing(Chat::getName));
        chat.sort(BY_USER_NUMBER_AND_NAME);
    }
}
