package blinov.ch2;

import blinov.MyUtils;

public class TaskA8 {

    public static boolean isPalindrome(int number) {
        boolean flag = true;
        int numberCount = MyUtils.getDigitCount(number);
        int low = 1;
        int high = (int) Math.pow(10, numberCount - 1);
        for (int j = 0; j < numberCount / 2; j++) {
            if (number / high % 10 != number/ low % 10) {
                flag = false;
                break;
            }
            low *= 10;
            high /= 10;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read(10, 9999);
        MyUtils.print(data);
        int [] newArray = new int [0];
        for(int i = 0; i < data.length; i++) {
            if(isPalindrome(data[i])) {
                newArray = MyUtils.addToArray(newArray, data[i]);
            }
        }
        MyUtils.print(newArray);
    }
}
