package blinov.ch1;

import blinov.MyUtils;

public class TaskB12 {
    private static int fib(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fib(number - 1) + fib(number - 2);
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(10, 99);
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(fib(i + 1));
        }
    }
}
