package blinov.ch1;

import blinov.MyUtils;

public class TaskB09 {
    private static void sortDecrease(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (mas[j] < mas[j + 1]) {
                    int tmp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

    private static void sortIncrease(int[] mas) {
        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read();
        MyUtils.print(arr);
        sortIncrease(arr);
        MyUtils.print(arr);
        sortDecrease(arr);
        MyUtils.print(arr);
    }
}
