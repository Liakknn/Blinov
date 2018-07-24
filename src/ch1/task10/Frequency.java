package ch1.task10;

public class Frequency {

    public void sort(int[] data) {
        int[] counters = new int[100];
        for (int value : data) {
            ++counters[value];
        }
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (counters[data[j]] < counters[data[j + 1]] || (counters[data[j]] == counters[data[j + 1]] && data[j] > data[j + 1])) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }
}
