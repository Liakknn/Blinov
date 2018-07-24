package ch1.task1;

public class MinOrMax {

    public int poiskMin(int number1, int number2) {
        if (number1 == number2) {
            return number1;
        } else if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }

    public int poiskMax(int number1, int number2) {
        if (number1 == number2) {
            return number1;
        } else if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
