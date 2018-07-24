package ch1.task2;

public class Division3or9 {

    public int[] add(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public boolean test(int number) {
        if (Math.abs(number % 3) == 0 || Math.abs(number % 9) == 0) {
            return true;
        }
        return false;
    }

    public int[] division(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (test(mas[i]) == true) {
                add(newArray, mas[i]);
            }
        }
        return newArray;
    }
}
