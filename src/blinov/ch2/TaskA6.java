package blinov.ch2;

import blinov.MyUtils;

public class TaskA6 {

    public static int increaseNumber(int [] mas) {
        int found = 0;
        for (int i = 0; i < mas.length; i++) {
            int countNumber = MyUtils.getDigitCount(mas[i]);
            int number = mas[i];
            for (int j = 0; j < countNumber; j++) {
                if (countNumber==1) {
                    break;
                }
                if (number % 10 > (number / 10) % 10) {
                     number /= 10;
                }
                else {
                    break;
                }
                if(j == countNumber - 1 && found == 0) {
                    found = mas[i];
                    break;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read();
        MyUtils.print(data);
        System.out.println(increaseNumber(data));
    }
}

