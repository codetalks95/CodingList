package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class MiddleWay {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("MiddleWay Logic result is::" + sum3(num));

    }

    private static List<Integer> sum3(int[][] num) {
        List<Integer> integerList = new ArrayList<>();
        int i = (num[0].length) / 2;
        int j = (num[1].length) / 2;
        integerList.add(num[0][i]);
        integerList.add(num[1][j]);
        return integerList;
    }
}
