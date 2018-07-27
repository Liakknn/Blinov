package blinov.ch1;

import blinov.MyUtils;

public class TaskB01 {
    private static boolean parityOfNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read();
        MyUtils.print(arr);
        System.out.println("ЧЁТНЫЕ ЧИСЛА:");
        for (int i = 0; i < arr.length; ++i) {
            if (parityOfNumber(arr[i])) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("НЕЧЁТНЫЕ ЧИСЛА:");
        for (int i = 0; i < arr.length; ++i) {
            if (!parityOfNumber(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
