package CodingBat.Arrays3;

import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args) {
        int[] num = {1, 3, 1, 4};
        System.out.println("Fix34 Logic result is::" + Arrays.toString(fix34Logic(num)));
    }

    private static int[] fix34Logic(int[] num) {
        int i = 0;
        while (i < num.length && num[i] != 3) {
            i++;
        }
        int j = i + 1;
        while (j < num.length && num[j] != 4) {
            j++;
        }
        while (i < num.length) {
            if (num[i] == 3) {
                int temp = num[i + 1];
                num[i + 1] = num[j];
                num[j] = temp;
                while (j < num.length && num[j] != 4) {
                    j++;
                }
            }
            i++;
        }
        return num;
    }
}