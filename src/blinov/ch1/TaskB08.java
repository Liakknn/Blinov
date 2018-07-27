package blinov.ch1;

import blinov.MyUtils;

public class TaskB08 {
    private static boolean simple(int number) {
        for (int division = 2; division <= number / 2; division++) {
            if (number % division == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read();
        MyUtils.print(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(simple(arr[i]));
        }
    }
}
