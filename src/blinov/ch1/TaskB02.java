package blinov.ch1;

import blinov.MyUtils;

public class TaskB02 {
    private static int[] findMinMax(int[] arr) {
        int[] minMax = new int[2];
        minMax[0] = arr[0];
        minMax[1] = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < minMax[0]) {
                minMax[0] = arr[i];
            }
            if (arr[i] > minMax[1]) {
                minMax[1] = arr[i];
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read();
        MyUtils.print(arr);
        int[] minMax = findMinMax(arr);
        MyUtils.print(minMax);
    }
}
