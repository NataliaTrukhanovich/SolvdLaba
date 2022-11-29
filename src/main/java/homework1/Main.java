package homework1;

import java.util.Arrays;

import static homework1.InsertionSort.sort;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[]{4, 0, 1, -9, 45, -3, 7, 12, 2};
        System.out.println("Unsorted array: " + Arrays.toString(mas));
        int[] sortmas = sort(mas);
        System.out.println("\nSorted array: "+Arrays.toString(sortmas));
    }
}
