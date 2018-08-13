package blinov.ch2;

import blinov.MyUtils;

public class TaskC16 {

    private static int sumRow(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static void increase(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (sumRow(array[j]) > sumRow(array[j + 1])) {
                    int[] tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

        public static void main (String[]args){
            int[][] arr = MyUtils.reading(0, 10);
            MyUtils.print(arr);
            System.out.println();
            increase(arr);
            MyUtils.print(arr);
        }
    }

