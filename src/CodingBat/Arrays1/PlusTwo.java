package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class PlusTwo {
    public static void main(String[] args) {
        int[][] num = {{1, 2}, {3, 4}};
        System.out.println("PlusTwo Logic result Logic is::" + plusTwoLogic(num));

    }

    private static List<Integer> plusTwoLogic(int[][] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < num[0].length; i++) {
            integerList.add(num[0][i]);
        }
        for (int j = 0; j < num[0].length; j++) {
            integerList.add(num[1][j]);
        }
        return integerList;
    }
}

