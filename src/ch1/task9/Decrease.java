package ch1.task9;

public class Decrease {

    public void sortDecrease(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (mas[j] < mas[j + 1]) {
                    int tmp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

    public void sortIncrease(int[] mas) {
        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (mas[j] < mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }
}
