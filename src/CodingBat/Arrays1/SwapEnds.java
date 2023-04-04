package CodingBat.Arrays1;

import java.util.Arrays;

public class SwapEnds {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("SwapEndsLogic result Logic is::" + Arrays.toString(swapEndsLogic(num)));
    }

    private static int[] swapEndsLogic(int[] num) {
        if (num.length >= 2) {
            int temp = num[0];
            num[0] = num[num.length - 1];
            num[num.length - 1] = temp;
        }
        return num;
    }
}
