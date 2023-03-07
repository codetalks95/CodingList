package SortingAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(Arrays.stream(numbers).toArray()));

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(bubbleSort(Arrays.stream(numbers).toArray())));
    }

    private static int[] bubbleSort(int[] numbers) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        return numbers;
    }
}