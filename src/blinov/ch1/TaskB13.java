package blinov.ch1;

import blinov.MyUtils;

public class TaskB13 {

    private static boolean isPalindrome(int number) {
        int count = MyUtils.getDigitCount(number);
        String string = number + "";
        for (int i = 0; i < count / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static int[] getPalindromes(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (isPalindrome(mas[i])) {
                newArray = MyUtils.addToArray(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = MyUtils.read(10, 999);
        MyUtils.print(arr);
        MyUtils.print(getPalindromes(arr));
    }
}
