package blinov;

import blinov.ch2.Position;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyUtils {

    public static int[] read() {
        return read(0, 100);
    }

    public static int[][] reading() {
        return reading(0, 100);
    }

    public static int[] read(int min, int max) {
        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + r.nextInt(max - min + 1);
        }
        return arr;
    }

    public static int[][] reading(int min, int max) {
        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = min + r.nextInt(max - min + 1);
            }
        }
        return arr;
    }


    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] addToArray(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }


    public static Position[] addToArray(Position[] oldArray, Position item) {
        Position[] newArray = new Position[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = item;
        return newArray;
    }


    public static int getDigitCount(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int mas[] = new int[25];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(100);
            System.out.print(" " + mas[i]);
        }

    }

}
