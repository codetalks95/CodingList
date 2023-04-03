package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.List;

public class Start1 {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 1, 2, 3, 1}, {1, 3, 2, 1}};
        System.out.println("Sum3 result Logic is::" + sum3(num));

    }

    private static double sum3(int[][] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < num[0].length; i++) {
            int count = 0;
            if (num[0][i] == 1) {
                count++;
                integerList.add(count);
            }
        }
        for (int i = 0; i < num[1].length; i++) {
            int count = 0;
            if (num[0][i] == 1) {
                count++;
                integerList.add(count);
            }
        }
        return sumOfInteger(integerList);
    }

    public static double sumOfInteger(List<Integer> integerList) {
        double sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum;
    }
}
