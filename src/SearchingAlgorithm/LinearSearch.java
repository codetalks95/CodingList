package SearchingAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        int randomNumber = numbers[new Random().nextInt(numbers.length)];
        System.out.println("Array of Numbers are" + "  " + Arrays.toString(Arrays.stream(numbers).toArray()));
        System.out.println("Number Picked By Algorithm" + "  " + randomNumber);
        System.out.println("Linear Search Number Index is " + "  " + linearSearch(numbers, randomNumber));
    }

    public static int linearSearch(int[] numbers, int numberToFind) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }
}