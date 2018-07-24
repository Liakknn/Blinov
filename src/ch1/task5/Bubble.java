package ch1.task5;

import java.util.Scanner;

public class Bubble {

    public void bubbleSort(int[] mas) {
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

}
