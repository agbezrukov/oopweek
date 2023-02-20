package com.dmdev.string.hw;

import java.util.Arrays;
import java.util.Locale;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {
    private static final String SPACE = " ";
    private static final String EMPTY = "";

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";

        System.out.println(removeDuplicateCharacter(value));
    }

    private static String removeDuplicateCharacter(String value) {
        String withoutSpaceValue = value.replace(SPACE, EMPTY);
        String withUpperCase = withoutSpaceValue.toUpperCase();

        StringBuilder s_buffer = new StringBuilder(withUpperCase.subSequence(0, withUpperCase.length()));

        int c = s_buffer.length() - 1;

        for (int i = 0; i < c; i++) {
            if (s_buffer.charAt(i) == s_buffer.charAt(i + 1)) {
                s_buffer.deleteCharAt(i + 1);
                i -= 1;
                c -= 1;
            }
        }
        return String.valueOf(s_buffer);
    }
}
