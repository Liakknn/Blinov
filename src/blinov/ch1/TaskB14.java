package blinov.ch1;

import blinov.MyUtils;

public class TaskB14 {
    private static int[] halfSum(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 1; i < mas.length - 1; i++) {
            int sum = mas[i - 1] + mas[i + 1];
            if (sum % 2 == 0 && mas[i] == sum / 2) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(0, 9);
        MyUtils.print(arr);
        MyUtils.print(halfSum(arr));
    }
}
