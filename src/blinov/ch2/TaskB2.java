package blinov.ch2;

import blinov.MyUtils;

import java.util.Scanner;

public class TaskB2 {

    public static int[][] newArray(int[][] array, int k) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (count <= k) {
                    array[i][j] = count;
                    count++;
                }
                else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][n];
        MyUtils.print(newArray(arr, k));
    }
}
