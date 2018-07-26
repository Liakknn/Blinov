package ch1;

import ch1.task10.Frequency;
import ch1.task11.LuckyNumber;
import ch1.task12.Fibanachy;
import ch1.task16.Arguments;
import ch1.task17.RandomNumber;
import ch1.task18.Password;
import ch1.task2.Division3or9;
import ch1.task5.Bubble;
import ch1.task6.ThreeDigit;
import java.util.Random;
import java.util.Scanner;

public class Blinov {

    public static String parityOfNumber(int number) {
        if (number % 2 == 0) {
            return "Четное";
        } else {
            return "Нечетное";
        }
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
        Arguments a = new Arguments();
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент -> " + args[i]);
        }
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
