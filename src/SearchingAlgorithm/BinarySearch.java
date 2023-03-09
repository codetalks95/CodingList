package SearchingAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int randomNumber = numbers[new Random().nextInt(numbers.length)];
        System.out.println("Array of Numbers are" + "  " + Arrays.toString(Arrays.stream(numbers).toArray()));
        System.out.println("Number Picked By Algorithm" + "  " + randomNumber);
        System.out.println("Binary Search Number Index is " + "  " + binarySearch(numbers, randomNumber));
    }

    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];
            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}