package CodingBat.Arrays1;

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        System.out.println("Make Middle result Logic is::" + Arrays.toString(makeMiddleLogic(number)));
    }

    private static int[] makeMiddleLogic(int[] num) {
        return new int[]{num[num.length / 2 - 1], num[num.length / 2]};
    }
}
