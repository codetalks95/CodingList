package CodingBat.Arrays3;

import java.util.Arrays;

public class SquareUp {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("SquareUp Logic result is::" + Arrays.toString(squareUpLogic(n)));
    }

    private static int[] squareUpLogic(int n) {
        int[] arr = new int[n * n];
        if (n == 0) {
            return arr;
        }
        for (int i = n - 1; i < arr.length; i += n) {
            for (int j = i; j >= i - i / n; j--)
                arr[j] = i - j + 1;
        }
        return arr;
    }
}

