package blinov.ch1;

import blinov.MyUtils;

public class TaskB05 {
    private static void bubbleSort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (Math.abs(mas[j]) < Math.abs(mas[j + 1])) {
                    int tmp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(-100, 100);
        MyUtils.print(arr);
        bubbleSort(arr);
        MyUtils.print(arr);
    }
}
