package ch1.task13;

public class Palindromes {

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

    public boolean isPalindrome(int number) {
        if (number % 2 == 0) {
            String string = number + "";
            int count = counter(number);
            for (int i = 0; i < count / 2; i++) {
                if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] palindromeMas(int[] mas) {
        int[] newArray = new int[0];
        for (int i = 0; i < mas.length; i++) {
            if (isPalindrome(i) == true) {
                newArray = add(newArray, i);
            }
        }
        return newArray;
    }
}
