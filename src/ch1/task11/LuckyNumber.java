package ch1.task11;

public class LuckyNumber {

    public int[] add(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public int counter(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public boolean lucky(int number) {
        int sum1 = 0;
        int sum2 = 0;
        int N = counter(number);
        if (number % 2 == 0) {
            for (int i = 0; i < N; i++) {
                int d = number % 10;
                if (i < N / 2) {
                    sum1 += d;
                } else {
                    sum2 += d;
                }
                number /= 10;
            }
            return sum1 == sum2;
        } else {
            return false;
        }
    }

    public int[] luckyMas(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (lucky(i) == true) {
                newArray = add(newArray, i);
            }
        }
        return newArray;
    }
}
