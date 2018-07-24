package ch1.task6;

public class ThreeDigit {

    public int[] add(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public boolean test(int number) {
        int hundred = Math.abs(number / 100);
        int dozen = Math.abs(number / 10) % 10;
        int unit = Math.abs(number % 100) % 10;
        if (Math.abs(number) >= 100 && Math.abs(number) <= 999) {
            if (hundred != dozen && unit != dozen && unit != hundred) {
                return true;
            }
        }
        return false;
    }

    public int[] three(int[] data) {
        int[] answer = new int[0];
        for (int i = 0; i < data.length; i++) {
            if (test(data[i]) == true) {
                answer = add(answer, data[i]);
            }
        }
        return answer;
    }
}
