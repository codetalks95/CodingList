package CodingBat.Arrays2;

import java.util.Arrays;

public class ZeroMax {
    public static void main(String[] args) {
        Integer[] num = {0, 5, 0, 3};
        System.out.println("ZeroMax result Logic is::" + Arrays.toString(ZeroMaxLogic(num)));
    }

    public static Integer[] ZeroMaxLogic(Integer[] num) {
        int max = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] % 2 != 0)
                max = Math.max(max, num[i]);
            if (num[i] == 0)
                num[i] = max;
        }
        return num;
    }
}