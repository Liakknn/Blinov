package blinov.ch2;

import blinov.MyUtils;

public class TaskC4 {
    /**
     * Метод возращает сумму элементов, расположенных между двумя максимумами в строке массива
     *
     * @param array входной массив
     * @return сумму элементов, расположенных между двумя максимумами
     */
    private static int sum(int[] array) {
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < array.length; i++) {
            if (max1 == -1) {
                max1 = i;
            } else if (max2 == -1) {
                if (array[i] > array[max1]) {
                    max2 = max1;
                    max1 = i;
                } else if (array[i] < array[max1]) {
                    max2 = i;
                }
            } else {
                if (array[i] > array[max1]) {
                    max2 = max1;
                    max1 = i;
                } else if (array[i] < array[max1] && array[i] > array[max2]) {
                    max2 = i;
                }
            }
        }
        if(max1 == - 1 || max2 == -1) {
            return 0;
        }
        int sum = 0;
        if (max1 > max2) {
            for (int j = max2 + 1; j < max1; j++) {
                sum += array[j];
            }
        }
        else {
            for (int j = max1 + 1; j < max2; j++) {
                sum += array[j];
            }
        }
        return sum;
    }

    /**
     * Метод возвращает сумму 2 максимальных элементов во всех строках
     *
     * @param array входной массив
     * @return сумму
     */
    private static int sumArrayTwoMax(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += sum(array[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = MyUtils.reading(0, 10);
        MyUtils.print(arr);
        System.out.println();
        System.out.println(sumArrayTwoMax(arr));

    }
}
