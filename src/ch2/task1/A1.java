package ch2.task1;

import java.util.Random;

public class A1 {

    public static int[] add(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public static int counter(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] max(int[] mas) {
        int[] newArray = new int[0];
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (counter(mas[i]) > counter(max)) {
                max = mas[i];
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (counter(max) == counter(mas[i])) {
                newArray = add(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static int[] min(int[] mas) {
        int[] newArray = new int[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (counter(mas[i]) < counter(min)) {
                min = mas[i];
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (counter(min) == counter(mas[i])) {
                newArray = add(newArray, mas[i]);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] mas = new int[10];
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(1000);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int[] max = max(mas);
        for (int i = 0; i < max.length; i++) {
            System.out.print(max[i] + " ");
        }
        System.out.println(counter(max[0]));
        int[] min = min(mas);
        for (int i = 0; i < min.length; i++) {
            System.out.print(min[i] + " ");
        }
        System.out.println(counter(min[0]));
    }
}
