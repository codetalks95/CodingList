package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft3 {
    public static void main(String[] args) {
        int[] num = {5, 11, 9};
        System.out.println("RotateLeft3 result Logic is::" + rotateLeft3LogicIs(num));

    }

    private static List<Integer> rotateLeft3LogicIs(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        if (num.length > 0) {
            for (int i = num.length-1; i >= 0; i--) {
                integerList.add(num[i]);
            }
        }
        return integerList;
    }
}

