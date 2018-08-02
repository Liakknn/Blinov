package blinov.ch2;

import blinov.MyUtils;

public class TaskA1 {
    /**
     * Возвращает все числа максимальной длины.
     *
     * @param mas Входной массив чисел.
     * @return Все числа максимальной длины.
     */
    private static int[] max(int[] mas) {
        int[] newArray = new int[0];
        int maxDigits = MyUtils.getDigitCount(mas[0]);
        for (int i = 1; i < mas.length; i++) {
            int digits = MyUtils.getDigitCount(mas[i]);
            if (digits > maxDigits) {
                maxDigits = digits;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (MyUtils.getDigitCount(mas[i]) == maxDigits) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    /**
     * Возвращает все числа минимальной длины.
     *
     * @param mas Входной массив чисел.
     * @return Все числа минимальной длины.
     */
    private static int[] min(int[] mas) {
        int[] newArray = new int[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (MyUtils.getDigitCount(mas[i]) < MyUtils.getDigitCount(min)) {
                min = mas[i];
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (MyUtils.getDigitCount(min) == MyUtils.getDigitCount(mas[i])) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    /**
     * Точка входа.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        int[] data = MyUtils.read();
        MyUtils.print(data);
        MyUtils.print(min(data));
        MyUtils.print(max(data));
    }
}
