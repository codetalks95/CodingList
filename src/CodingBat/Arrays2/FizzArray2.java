package CodingBat.Arrays2;

import java.util.Arrays;

public class FizzArray2 {
    public static void main(String[] args) {
        int[] num = {4};
        System.out.println("fizzArray2 logic result is::" + " " + Arrays.toString(fizzArray2Logic(num.length)));
    }

    public static String[] fizzArray2Logic(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }
}