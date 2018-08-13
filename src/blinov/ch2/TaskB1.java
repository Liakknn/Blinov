package blinov.ch2;
import java.util.Scanner;

public class TaskB1 {

    private static boolean does(int k, int begin, int end, boolean left, boolean right) {
        if (left == true & right == true & (begin <= k & k <= end)) {
            return true;
        }
        if (left == false & right == true & (begin < k & k <= end)) {
            return true;
        }
        if (left == true & right == false & (begin <= k & k < end)) {
            return true;
        }
        if (left == false & right == false & (begin < k & k < end)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        boolean left = sc.nextBoolean();
        boolean right = sc.nextBoolean();
        int k = sc.nextInt();
        System.out.println(does(k, begin, end, left, right));
    }
}
