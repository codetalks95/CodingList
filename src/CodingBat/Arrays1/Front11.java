package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class Front11 {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {}};
        System.out.println("Front11 result Logic is::" + frontEndLogicIs(num));
    }

    private static List<Integer> frontEndLogicIs(int[][] num) {
        List<Integer> integerList = new ArrayList<>();
        if ((num[0].length) != 0 && (num[1].length) != 0) {
            integerList.add(num[0][0]);
            integerList.add(num[1][0]);
        } else if (num[0].length == 0 && num[1].length != 0) {
            integerList.add(num[1][0]);
        } else if (num[1].length == 0 && num[0].length != 0) {
            integerList.add(num[0][0]);
        } else {
            integerList.add(0);
        }
        return integerList;
    }
}
