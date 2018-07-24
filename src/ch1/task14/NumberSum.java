package ch1.task14;

public class NumberSum {

    public int[] add(int[] oldArray, int number) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public int[] polSum(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] == (mas[i - 1] + mas[i + 1]) / 2) {
                newArray = add(newArray, i);
            }
        }
        return newArray;
    }
}
