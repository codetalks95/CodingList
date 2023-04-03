package CodingBat.Arrays1;

import java.util.Arrays;

public class MaxEnds3 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("MaxEnds3 result Logic is::" + Arrays.toString(maxEnds3(num)));

    }

    private static int[] maxEnds3(int[] num) {
        int[] numbers = new int[num.length];
        int largest = num[0];

        for (int number : num) {
            if (largest < number) {
                largest = number;
            }
        }
        for (int i = 0; i < num.length; i++) {
            numbers[i] = largest;
        }
        return numbers;
    }
}