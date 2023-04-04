package CodingBat.Arrays2;

import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] num = {1, 0, 1, 0, 0, 1, 1};
        System.out.println("EvenOdd logic result is::" + " " + Arrays.toString(evenOddLogic(num)));
    }

    public static int[] evenOddLogic(int[] num) {
        int i = 0;
        while (i < num.length && num[i] % 2 == 0) {
            i++;
        }
        for (int j = i + 1; j < num.length; j++) {
            if (num[j] % 2 == 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                i++;
            }
        }
        return num;
    }
}