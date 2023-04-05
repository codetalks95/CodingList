package CodingBat.Arrays2;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] num = {6, 2, 5, 3};
        System.out.println("ShiftLeft result Logic is::" + Arrays.toString(shiftLeftLogic(num)));
    }

    private static int[] shiftLeftLogic(int[] num) {
        if (num.length < 1) {
            return num;
        }
        int first = num[0];
        for (int i = 1; i < num.length; i++) {
            num[i - 1] = num[i];
        }
        num[num.length - 1] = first;
        return num;
    }
}