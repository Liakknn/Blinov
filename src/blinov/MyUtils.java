package blinov;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyUtils {

    public static int[] read() {
        return read(0, 100);
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

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] addToArray(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
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
//        int number = sc.nextInt();
//        System.out.println(parityOfNumber(number));
//
        Random r = new Random();
        int mas[] = new int[25];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(100);
            System.out.print(" " + mas[i]);
        }
//        Password p = new Password();
//        System.out.println();
//        System.out.println("Enter password ");
//        p.setYourPassword(sc.next());
//        p.ComparePasswords(p.getYourPassword());
//        System.out.println();
//        Frequency f = new Frequency();
//        f.sort(mas);
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(" " + mas[i]);
//        }
//        System.out.println();;
//        rn.withTheTransition(mas);

//        a.vuvod(args);
//        Bubble b = new Bubble();
//        b.bubbleSort(mas);
//        System.out.println();
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(" " + mas[i]);
//        }
//        ThreeDigit t = new ThreeDigit();
//        mas = t.three(mas);
//        System.out.println();
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(" " + mas[i]);
//        }
//
//        LuckyNumber ln = new LuckyNumber();
//        System.out.println(ln.counter(398));
//
//        Fibanachy f = new Fibanachy();
//        System.out.println(f.fib(8));
    }

}
