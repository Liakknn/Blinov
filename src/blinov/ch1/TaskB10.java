package blinov.ch1;

import blinov.MyUtils;

public class TaskB10 {
    private static void sort(int[] data) {
        int[] frequencies = new int[100];
        for (int value : data) {
            ++frequencies[value];
        }
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (frequencies[data[j]] < frequencies[data[j + 1]] || (frequencies[data[j]] == frequencies[data[j + 1]] && data[j] > data[j + 1])) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(0, 5);
        MyUtils.print(arr);
        sort(arr);
        MyUtils.print(arr);
    }
}
