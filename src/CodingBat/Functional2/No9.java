package CodingBat.Functional2;

import java.util.ArrayList;
import java.util.List;

public class No9 {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 19};
        System.out.println("Result of Number9 Logic::" + no9Logic(num));
    }

    private static List<Integer> no9Logic(Integer[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (Integer integer : num) {
            if (integer % 10 != 9) {
                integerList.add(integer);
            }
        }
        return integerList;
    }
}

