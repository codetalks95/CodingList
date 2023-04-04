package CodingBat.Arrays1;

import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("BiggerTwo result Logic is::" + Arrays.toString(sum3(num)));
    }

    private static int[] sum3(int[][] num) {
        int sum = 0, val = 0;
        if (num[0].length > 0) {
            for (int j : num[0]) {
                sum += j;
            }
        }
        if (num[1].length > 0) {
            for (int j : num[1]) {
                val += j;
            }
        }
        if (sum == val) {
            return num[0];
        } else if (sum > val) {
            return num[0];
        } else {
            return num[1];
        }
    }
}

