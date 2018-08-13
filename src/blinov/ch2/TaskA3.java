package blinov.ch2;

import blinov.MyUtils;

public class TaskA3 {

    /**
     * Метод, который возвразщает среднее значение длины цифр в массиве
     * @param mas входной массив
     * @return среднее значение длины цифр в массиве
     */
    private static double average(int [] mas) {
        int sum = 0;
        for(int i = 0; i < mas.length; i++) {
            sum += MyUtils.getDigitCount(mas[i]);
        }
        return (double) sum / mas.length;
    }

    /**
     *
     * @param mas
     * @param average
     * @return
     */
    private static int[] lessAverage(int[] mas, double average) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (MyUtils.getDigitCount(mas[i]) < average) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    private static int[] moreAverage(int[] mas, double average) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (MyUtils.getDigitCount(mas[i]) > average) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read(0, 10000);
        MyUtils.print(data);
        double average = average(data);
        MyUtils.print(lessAverage(data, average));
        MyUtils.print(moreAverage(data, average));
    }
}
