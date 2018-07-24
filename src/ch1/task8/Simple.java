package ch1.task8;

public class Simple {

    public String simple(int number) {
        int c = 0;
        for (int division = 2; division < number / 2; division++) {
            if (number % division == 0) {
                c = 1;
            }
        }
        if (c == 1) {
            return "непростое";
        } else {
            return "простое";
        }
    }
}
