package ch1.task17;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random r = new Random();
        int length = Integer.parseInt(args[0]);
        for (int i = 0; i < length; i++) {
            System.out.print(r.nextInt(100));
            if (i != length - 1) {
                if (r.nextBoolean() == true) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
