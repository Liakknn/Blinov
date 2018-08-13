package blinov.ch2;

import blinov.MyUtils;

public class TaskB3 {
    public int[] theRootsOfEquation(int a, int b, int c) {
        int[] newArray = new int[0];
        if (a != 0 & b != 0 & c != 0) {
            int d = (int) Math.sqrt(Math.pow(b, 2) - 4 * a * c);
            if (d > 0) {
                newArray = MyUtils.addToArray(newArray, (-b + d) / (2 * a));
                newArray = MyUtils.addToArray(newArray, (-b - d) / (2 * a));
            }
            if (d < 0) {
                return null;
            }
            if (d == 0) {
                newArray = MyUtils.addToArray(newArray, (-b / (2 * a)));
            }
        } else if (a == 0) {
            if (b != 0) {
                newArray = MyUtils.addToArray(newArray, (b / -c));
            } else {
                return null;
            }
        }
        return newArray;
    }

}
