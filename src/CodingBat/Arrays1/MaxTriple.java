package CodingBat.Arrays1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxTriple {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("MaxTripe Logic result is::" + maxTripleLogic(num));
    }

    private static int maxTripleLogic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        int middleElement = num[num.length / 2];
        int firstElement = num[0];
        int lastElement = num[num.length - 1];
        integerList.add(middleElement);
        integerList.add(firstElement);
        integerList.add(lastElement);
        return Collections.max(integerList);
    }
}
