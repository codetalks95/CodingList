package CodingBat.Arrays2;

import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
        Integer[] num = {1, 10, 10, 2};
        System.out.println("WithoutTen result Logic is::" + " " + Arrays.toString(withoutTenLogic(num)));
    }

    public static Integer[] withoutTenLogic(Integer[] num) {
        int i = 0;
        while (i < num.length && num[i] != 10) {
            i++;
        }
        for (int j = i + 1; j < num.length; j++) {
            if (num[j] != 10) {
                num[i] = num[j];
                num[j] = 10;
                i++;
            }
        }
        for (; i < num.length; i++) {
            num[i] = 0;
        }
        return num;
    }
}