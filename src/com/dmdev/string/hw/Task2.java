package com.dmdev.string.hw;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки.
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

        int[] resultArray = arrayDigitsFromString(value);
        int sumArrayDigits = sumArrayDigits(resultArray);

        System.out.println(sumArrayDigits);
    }

    private static int sumArrayDigits(int[] value) {
        int sumValue = 0;

        for (int i : value) {
            sumValue += i;
        }
        return sumValue;
    }

    private static int[] arrayDigitsFromString(String value) {

        int count = 0;
        char[] valueArrayString = value.toCharArray();
        int[] valueArrayIntFromString = new int[arraySizeIntFromString(value)];

        for (int i = 0; i < valueArrayString.length; i++) {
            if (valueArrayString[i] == '0' || valueArrayString[i] == '1' || valueArrayString[i] == '2' ||
                    valueArrayString[i] == '3' || valueArrayString[i] == '4' || valueArrayString[i] == '5' ||
                    valueArrayString[i] == '6' || valueArrayString[i] == '7' || valueArrayString[i] == '8' ||
                    valueArrayString[i] == '9') {

                valueArrayIntFromString[count] = Integer.parseInt(String.valueOf(valueArrayString[i]));
                count++;
            }
        }
        return valueArrayIntFromString;
    }

    private static int arraySizeIntFromString(String value) {
        String result = value.replace("0", "")
                .replace("1", "").replace("2", "")
                .replace("3", "").replace("4", "")
                .replace("5", "").replace("6", "")
                .replace("7", "").replace("8", "")
                .replace("9", "");
        return value.length() - result.length();
    }
}
