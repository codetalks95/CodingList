package CodingBat.Arrays2;

import java.util.Arrays;

public class FizzArray3 {
    public static void main(String[] args) {
        int[] num = {5, 10};
        System.out.println("fizzArray3 logic result is::" + " " + Arrays.toString(fizzArray3Logic(num[0], num[1])));
    }

    public static int[] fizzArray3Logic(int start, int end) {
        int[] arr = new int[end - start];

        for (int i = start; i < end; i++)
            arr[i - start] = i;

        return arr;
    }
}