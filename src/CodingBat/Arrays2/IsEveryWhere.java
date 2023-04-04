package CodingBat.Arrays2;

import java.util.*;

public class IsEveryWhere {
    public static void main(String[] args) {
        int[] num = {1, 2, 1, 3};
        int val = 1;
        System.out.println("IsEveryWhere result Logic is::" + isEverywhereLogic(num, val));
    }

    public static boolean isEverywhereLogic(int[] num, int val) {
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != val && num[i + 1] != val) return false;
        }

        return true;
    }
}
