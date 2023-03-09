package CodingExamples;

import java.util.*;

public class CountOccurrence {
    public static void main(String[] args) {
        int count = 0;
        int[] num = new int[5];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);
        }
        System.out.println("The Number Array is" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        for (int number : num) {
            countOccurence(num, number).forEach((key1, value) -> System.out.println("Frequency of Number" + " " + key1 + " " + "is" + " " + value));
        }
    }

    private static Map<Integer, Integer> countOccurence(int[] num, int requiredNumber) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        int count = 0;
        for (int j : num) {
            if (j == requiredNumber) {
                count++;
            }
        }
        integerIntegerMap.put(requiredNumber, count);
        return integerIntegerMap;
    }
}
