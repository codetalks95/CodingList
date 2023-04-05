package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class Sum13 {
    public static void main(String[] args) {
        int[] num = {1, 2, 2, 1, 13};
        System.out.println("Sum13 result Logic is::" + sum13Logic(num));
    }

    private static int sum13Logic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            integerList.add(j);
        }
        for (int i = 0; i < num.length; i++) {
            if (i != num.length - 1 && integerList.contains(13)) {
                int index = integerList.indexOf(13);
                integerList.remove(index);
                if (index != num.length - 1) {
                    integerList.remove(index + 1);
                }
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