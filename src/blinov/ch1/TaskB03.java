package blinov.ch1;

import blinov.MyUtils;

public class TaskB03 {

    private static boolean div3or9(int number) {
        return Math.abs(number % 3) == 0 || Math.abs(number % 9) == 0;
    }

    private static int[] division(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (div3or9(mas[i])) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read();
        MyUtils.print(arr);
        MyUtils.print(division(arr));
    }
}
