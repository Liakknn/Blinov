package ch1.task7;

public class Division {

    public int nod(int number1, int number2) {
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 %= number2;
            } else if (number1 < number2) {
                number2 %= number1;
            } else {
                return number1;
            }
        }
        return number1 + number2;
    }

    public int nok(int number1, int number2) {
        return number1 * (number2 / nod(number1, number2));
    }
}
