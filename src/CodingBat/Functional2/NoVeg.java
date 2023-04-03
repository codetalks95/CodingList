package CodingBat.Functional2;

import java.util.ArrayList;
import java.util.List;

public class NoVeg {
    public static void main(String[] args) {
        Integer[] num = {1, -2};
        System.out.println("NoVeg Logic result is::" + omittingLessThenZero(num));
    }

    private static List<Integer> omittingLessThenZero(Integer[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (Integer integer : num) {
            if (integer > 0) {
                integerList.add(integer);
            }
        }
        return integerList;
    }
}

