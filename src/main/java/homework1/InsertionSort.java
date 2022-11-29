package homework1;

public class InsertionSort {
    public static int[] sort(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            for (int j = i; j > 0 && mas[j - 1] > mas[j]; j--) {
                int tmp = mas[j];
                mas[j] = mas[j - 1];
                mas[j - 1] = tmp;
            }
        }
        return mas;
    }
}
