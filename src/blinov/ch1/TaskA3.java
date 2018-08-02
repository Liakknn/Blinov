package  blinov.ch1;

import java.util.Random;

public class TaskA3 {
    public static void main(String[] args) {
        Random r = new Random();
        int length = Integer.parseInt(args[0]);
        for (int i = 0; i < length; i++) {
            System.out.print(r.nextInt(100));
            if (i != length - 1) {
                if (r.nextBoolean()) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
