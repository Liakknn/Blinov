package ch1.task12;

public class Fibanachy {

    public int fib(int count) {
        if (count == 1 || count == 2) {
            return 1;
        }
        return fib(count - 1) + fib(count - 2);
    }
}
