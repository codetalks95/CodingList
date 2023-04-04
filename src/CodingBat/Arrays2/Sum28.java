package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Sum28 {
    public static void main(String[] args) {
        int[] num = {2, 3, 2, 2, 4, 2};
        System.out.println("Sum2 result Logic is::" + sum28Logic(num));
    }

    private static int sum28Logic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            if (j == 2) {
                integerList.add(j);
            }
        }
        return addList(integerList);
    }

    private static int addList(List<Integer> integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum;
    }
}