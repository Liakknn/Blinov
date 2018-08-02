package blinov.ch2;

import blinov.MyUtils;

public class TaskA2 {
    /**
     * Метод, сортирующий числа по убыванию значений их длины
     * @param mas Ыходной массив чисел
     */

    private static void sortDecrease(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (MyUtils.getDigitCount(mas[j]) < MyUtils.getDigitCount(mas[j + 1]) ||  (MyUtils.getDigitCount(mas[j]) == MyUtils.getDigitCount(mas[j + 1])&&mas[j]<mas[j+1])) {
                    int tmp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

    /**
     * Метод, сортирующий числа по возрастанию значений их длины
     * @param mas Ыходной массив чисел
     */
    private static void sortIncrease(int[] mas) {
        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (MyUtils.getDigitCount(mas[j]) > MyUtils.getDigitCount(mas[j + 1]) ||  (MyUtils.getDigitCount(mas[j]) == MyUtils.getDigitCount(mas[j + 1])&&mas[j]>mas[j+1])) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read(0, 10000);
        MyUtils.print(data);
        sortDecrease(data);
        MyUtils.print(data);
        sortIncrease(data);
        MyUtils.print(data);
    }
}
