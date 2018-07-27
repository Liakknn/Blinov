package blinov.ch1;

import blinov.MyUtils;

public class TaskB06 {
    private static boolean test(int number) {
        int hundred = Math.abs(number / 100) % 10;
        int dozen = Math.abs(number / 10) % 10;
        int unit = Math.abs(number) % 10;
        if (Math.abs(number) >= 100 && Math.abs(number) <= 999) {
            if (hundred != dozen && unit != dozen && unit != hundred) {
                return true;
            }
        }
        return false;
    }

    private static int[] three(int[] data) {
        int[] answer = new int[0];
        for (int i = 0; i < data.length; i++) {
            if (test(data[i]) == true) {
                answer = MyUtils.addToArray(answer, data[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = MyUtils.read(100, 999);
        MyUtils.print(arr);
        MyUtils.print(three(arr));
    }
}
