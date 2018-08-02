package blinov.ch2;

import blinov.MyUtils;

public class TaskA7 {

    public static boolean diversNumber(int number) {
        boolean[] mas = new boolean[10];
        boolean flag = true;
        int numberC = MyUtils.getDigitCount(number);
        for (int i = numberC - 1; i >= 0; i--) {
            if (!mas[number % 10]) {
                mas[number % 10] = true;
                number /= 10;
            }
            else if(mas[number % 10]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int divers(int [] data) {
        int number = 0;
        for(int i = 0; i < data.length; i++) {
            if(diversNumber(data[i]) && number == 0) {
                number = data[i];
                break;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] data = MyUtils.read(10, 9999);
        MyUtils.print(data);
        System.out.println(divers(data));
    }
}
