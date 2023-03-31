package CodingExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayFront9 {
    public static void main(String[] args) {
        int[] number = {1, 2, 9, 3, 4};
        System.out.println("Array Front 9 Result is::" + arrayFront9(number));
    }

    private static boolean arrayFront9(int[] num) {
        List<Integer> integerList = new ArrayList<>();
        for (Integer item : num) {
            integerList.add(item);
        }
        if (integerList.size() > 4) {
            for (int i = 0; i <= 4; i++) {
                if (integerList.get(i) == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
