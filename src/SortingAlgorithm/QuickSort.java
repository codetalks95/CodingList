package SortingAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));
        System.out.println("After Sorting");
        quickSort(numbers);
    }

    private static void quickSort(int[] numbers) {
    }
}