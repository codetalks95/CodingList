package CodingBat.Arrays2;

import java.util.Arrays;

public class FizBuzz {
    public static void main(String[] args) {
        int[] num = {1, 6};
        System.out.println("FizzBuzz logic result is::" + " " + Arrays.toString(fizzBuzzLogic(num[0], num[1])));
    }

    public static String[] fizzBuzzLogic(int start, int end) {
        String[] arr = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }
        return arr;
    }
}