package blinov.ch2;

import blinov.MyUtils;

public class TaskA5 {

    private static int[] even(int [] mas) {
        int[] newArray = new int[0];
        for(int i = 0; i < mas.length; i++) {
            int numberCount = MyUtils.getDigitCount(mas[i]);
            int number = mas[i];
            for (int j = 0; j < numberCount; j++) {
                if ((mas[i] % 10) % 2 != 0) {
                    break;
                }
                else {
                    number /= 10;
                }
                if (j == numberCount-1) {
                    newArray = MyUtils.addToArray(newArray, mas[i]);
                }
            }
        }
        return newArray;
    }

    public static int [] equal(int [] mas) {
        int[] newArray = new int[0];
        for(int i = 0; i < mas.length; i++) {
            int numberCount = MyUtils.getDigitCount(mas[i]);
            int number = mas[i];
            int countEven = 0;
            int countOdd = 0;
            for (int j = 0; j < numberCount; j++) {
                if ((number % 10) % 2 == 0) {
                    countEven++;
                    number/=10;
                } else if((number % 10) % 2 != 0) {
                    countOdd++;
                    number/=10;
                }
                if((j == numberCount - 1) && (countEven == countOdd)) {
                    newArray = MyUtils.addToArray(newArray, mas[i]);
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read();
        MyUtils.print(data);
        MyUtils.print(equal(data));
        MyUtils.print(even(data));
    }
}
