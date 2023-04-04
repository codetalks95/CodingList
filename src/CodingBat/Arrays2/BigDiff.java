package CodingBat.Arrays2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigDiff {
    public static void main(String[] args) {
        int[] num = {10, 3, 5, 6};
        System.out.println("BigDiff logic result is::" + " " + bigDiffLogic(num));
    }

    private static int bigDiffLogic(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (int j : num) {
            integerList.add(j);
        }
        return Collections.max(integerList) - Collections.min(integerList);
    }
}
