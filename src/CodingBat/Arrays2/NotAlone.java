package CodingBat.Arrays2;

import java.util.Arrays;

public class NotAlone {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        int val = 2;
        System.out.println("NotAlone result Logic is::" + Arrays.toString(notAloneLogic(num, val)));
    }

    private static int[] notAloneLogic(int[] num, int val) {
        int[] arr = new int[num.length];
        if (num.length >= 1) {
            arr[0] = num[0];
            arr[arr.length - 1] = num[num.length - 1];
        }
        for (int i = 1; i <= num.length - 2; i++) {
            if (num[i] == val && num[i] != num[i - 1] && num[i] != num[i + 1])
                arr[i] = Math.max(num[i - 1], num[i + 1]);
            else
                arr[i] = num[i];
        }
        return arr;
    }
}