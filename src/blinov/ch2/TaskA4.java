package blinov.ch2;

import blinov.MyUtils;

public class TaskA4 {

    public static int countNumber(int number) {
        boolean[] mas = new boolean[10];
        int count = 0;
        int numberC = MyUtils.getDigitCount(number);
        for (int i = numberC - 1; i >= 0; i--) {
            if (!mas[number % 10]) {
                mas[number % 10] = true;
                count++;
                number /= 10;
            }
        }
        return count;
    }

    public static int minCount(int [] data) {
        int min = data[0];
        for(int i = 1; i < data.length; i++) {
            if(countNumber(data[i]) < countNumber(min)) {
                min = data[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read(10, 9999);
        MyUtils.print(data);
        System.out.println(minCount(data));
    }
}
