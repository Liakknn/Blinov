package blinov.ch1;

import blinov.MyUtils;

public class TaskB11 {

    private static boolean lucky(int number) {
        int sum1 = 0;
        int sum2 = 0;
        int n = MyUtils.getDigitCount(number);
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                int d = number % 10;
                if (i < n / 2) {
                    sum1 += d;
                } else {
                    sum2 += d;
                }
                number /= 10;
            }
            return sum1 == sum2;
        } else {
            return false;
        }
    }

    private static int[] luckyMas(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (lucky(mas[i]) == true) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(10, 99);
        MyUtils.print(arr);
        MyUtils.print(luckyMas(arr));
    }
}
