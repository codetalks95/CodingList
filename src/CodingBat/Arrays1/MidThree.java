package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class MidThree {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("MidThree Logic result Logic is::" + midThreeLogic(num));
    }

    private static List<Integer> midThreeLogic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        int startingIndex = num.length / 2;
        for (int i = startingIndex; i < num.length; i++) {
            integerList.add(num[i]);
        }
        return integerList;
    }
}