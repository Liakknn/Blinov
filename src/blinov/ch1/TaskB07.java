package blinov.ch1;

import blinov.MyUtils;

public class TaskB07 {
    private static int nod(int number1, int number2) {
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 %= number2;
            } else if (number1 < number2) {
                number2 %= number1;
            } else {
                return number1;
            }
        }
        return number1 + number2;
    }

    private static int nok(int number1, int number2) {
        return number1 * (number2 / nod(number1, number2));
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(100, 999);
        MyUtils.print(arr);
        System.out.println(nod(arr[0], arr[1]));
        System.out.println(nok(arr[0], arr[1]));
    }
}
